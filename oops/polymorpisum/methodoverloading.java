import java.util.Scanner;

class Calculator {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class methodoverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        c.add(x, y);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        c.add(a, b, d);
    }
}
