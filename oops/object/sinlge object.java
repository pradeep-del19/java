import java.util.Scanner;
class Main {
    void show(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String msg=sc.nextLine();
        Main obj=new Main();
        obj.show(msg);
    }
}