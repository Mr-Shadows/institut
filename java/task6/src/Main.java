import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("John", 20));
        list1.add(new Student("Alice", 18));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Bob", 22));
        list2.add(new Student("Emily", 19));
        list2.add(new Student("Ok", 0));

        List<Student> mergedList = mergeSort(list1, list2);

        for (Student student : mergedList) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getAge() < list2.get(j).getAge()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
