import java.util.Scanner;

abstract class Addition {
    int a, b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void add();

    void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }

    void addition() {
        System.out.println("Addition: " + (a + b));
    }
}

class Subtraction extends Addition {

    Subtraction(int a, int b) {
        super(a, b);
    }

    @Override
    void add() {
        System.out.println("Addition (Abstract Method): " + (a + b));
    }
}

public class Ab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Subtraction s = new Subtraction(a, b);

        s.add();        
        s.multiply();   
        s.addition();   

      
    }
}
