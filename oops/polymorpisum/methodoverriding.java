import java.util.Scanner;

class Bank {
    void interest() {
        System.out.println("Bank interest");
    }
}

class SBI extends Bank {
    void interest() {
        System.out.println("SBI Interest = 6%");
    }
}

class HDFC extends Bank {
    void interest() {
        System.out.println("HDFC Interest = 7%");
    }
}

public class methodoverriding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bank name (SBI/HDFC): ");
        String bank = sc.next();

        Bank b;

        if (bank.equalsIgnoreCase("SBI")) {
            b = new SBI();
        } else {
            b = new HDFC();
        }

        b.interest();
    }
}
