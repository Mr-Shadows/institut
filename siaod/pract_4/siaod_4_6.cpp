/*
Разработать приложение, которое использует хеш-таблицу для
организации прямого доступа к записям файла.

Структура записи - Цепное хеширование.
*/
#include <iostream>
#include <cstring>

// Определение структуры для данных
typedef struct tag_data {
    char name[100]; // Имя сущности
} DATA;

// Определение структуры для узла дерева
typedef struct tag_tree {
    DATA data; // Узел содержит данные типа DATA
    struct tag_tree* left, * right; // Указатели на левого и правого потомков
} TREE;

// Перечисление для указания добавления узла слева или справа
enum TYPE { RIGHT, LEFT };

// Функция добавления узла в дерево
TREE* add_node(TREE* node, const char* name, TYPE type = LEFT) {
    // Создание нового узла
    TREE* new_node = new TREE;

    // Проверка наличия узла и добавление нового узла соответственно
    if (type == LEFT && node != NULL)
        node->left = new_node;
    else if (node != NULL)
        node->right = new_node;

    // Копирование имени в данные нового узла
    strcpy_s(new_node->data.name, sizeof(new_node->data.name), name);

    // Инициализация указателей на левого и правого потомков как NULL
    new_node->left = NULL;
    new_node->right = NULL;
    return new_node;
}

// Функция копирования имени из левого узла в правый узел
void copy_left_to_right(TREE* node) {
    if (node != NULL) {
        if (node->left != NULL) {
            // Если существует правый узел, копировать имя из левого в правый
            if (node->right != NULL)
                strcpy_s(node->right->data.name, sizeof(node->right->data.name), node->left->data.name);

            // Рекурсивное копирование из левого в правый узел
            copy_left_to_right(node->left);
            copy_left_to_right(node->right);
        }
    }
}

// Функция отображения узлов дерева
void show_next(TREE* node, int off) {
    if (node != NULL) {
        // Отображение имени узла с отступом
        for (int i = 0; i < off; i++)
            putchar(' ');
        printf("%s\n", node->data.name);

        // Рекурсивное отображение левого и правого узлов с увеличением отступа для правого узла
        show_next(node->left, off);
        show_next(node->right, off + 1);
    }
}


void show_tree(TREE* root) {
    if (root != NULL) {
        printf("%s\n", root->data.name);
        show_next(root->left, 0);
        show_next(root->right, 1);
    }
}

void del_next(TREE* node) {
    if (node != NULL) {
        del_next(node->left);
        del_next(node->right);
        printf("node %s - deleted\n", node->data.name);
        delete node;
    }
}

void del_tree(TREE* root) {
    if (root != NULL) {
        del_next(root->left);
        del_next(root->right);
        printf("node %s - deleted\n", root->data.name);
        delete root;
    }
}

int main() {
    TREE* root = add_node(NULL, "Root");
    TREE* current = add_node(root, "File 1", LEFT);
    current = add_node(current, "File 2", LEFT);
    current = add_node(root, "Folder 1", RIGHT);
    current = add_node(current, "File 11", LEFT);
    current = add_node(current, "File 12", LEFT);
    current = add_node(root->right, "Folder 2", RIGHT);
    current = add_node(current, "File 21", RIGHT);

    std::cout << "Original Tree:" << std::endl;
    show_tree(root);

    // Копирование вершин с левого указателя в правый
    copy_left_to_right(root);

    std::cout << "\nTree After Copying Left to Right:" << std::endl;
    show_tree(root);

    // del_tree(root); // Освобождение памяти

    return 0;
}
