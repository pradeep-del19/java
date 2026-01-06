import java.util.Scanner;
class Main{
    void show(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("");
        String msg=sc.nextLine();
        Main obj1=new Main();
        Main obj2=new Main();
        obj1.show(msg);
        obj2.show(msg);
    }
}