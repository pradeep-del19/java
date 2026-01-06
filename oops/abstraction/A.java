import java.util.Scanner;

interface Addition {
    void add();
    void multiply();
}

class Subtraction implements Addition {
    int a, b;

    Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println("Addition: " + (a + b));
    }

    public void multiply() {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Subtraction s = new Subtraction(x, y);
        s.add();
        s.multiply();

        
    }
}
