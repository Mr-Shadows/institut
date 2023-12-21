#include "Product.h"
using namespace std;


int main() {
    system("chcp 1251");
    Product a;
    int swc;
    bool wh = true;
    string saveName;
    while (wh)
    {
        cout << "\nДействия:" 
            << "\n\t0 - Stopping the input"
            << "\n\t1 - Add new data"
            << "\n\t2 - translate.txt in .bin(binary file)"
            << "\n\t3 - output of the .txt content"
            << "\n\t4 - output of the content .bin"
            << "\n\t5 - saving binary file data"
            << "\n\t6 - data changes by number"
            << "\n\t7 - deleting by number"
            << "\n\t8 - creating a file with a list of universities leading this discipline" << endl;
        cin >> swc;
        switch (swc)
        {
        case 0:
            wh = false;
            break;
        case 1:
            a.ProductAdd();
            break;
        case 2:
            a.txt_to_bin();
            cout << "\nTranslated into a binary file." << endl;
            break;
        case 3:
            a.print_txt();
            break;
        case 4:
            a.print_bin();
            break;
        case 5:
            cout << "Enter the name of the file to save: ";
            cin >> saveName;
            a.bin_to_txt(saveName);
            cout << "\nTranslated into a text file." << endl;
            break;
        case 6:
            int var;
            cout << "\nThe information under which ID should be changed:\n";
            a.print_txt();
            cout << endl;
            cin >> var;
            a.change_inf(var);
            break;
        case 7:
            int ch;
            cout << "Enter the number to delete:";
            cin >> ch;
            a.DelCh(ch);
            break;
        case 8:
            a.country_to_txt();
            cout << "\nFile Create\n";
            break;
        default:
            wh = false;
            break;
        }
    }
}