import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int i) {
        id = i;
        name = "Unknown";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class constructoroverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Student s = new Student(id, name);
        s.display();
    }
}
