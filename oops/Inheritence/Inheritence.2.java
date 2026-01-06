import java.util.Scanner;

interface Father {
    void fatherName(String name);
}

interface Mother {
    void motherName(String name);
}

class Child implements Father, Mother {
    public void fatherName(String name) {
        System.out.println("Father Name: " + name);
    }

    public void motherName(String name) {
        System.out.println("Mother Name: " + name);
    }
}

public class Inheritence2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter father name: ");
        String f = sc.nextLine();

        System.out.print("Enter mother name: ");
        String m = sc.nextLine();

        Child c = new Child();
        c.fatherName(f);
        c.motherName(m);
    }
}
