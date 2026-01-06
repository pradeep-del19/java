import java.util.Scanner;
class Student{
    int rollNo;
    String name;
    void input(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    void display(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        Student s = new Student();
        s.input(r, n);
        s.display();
    }
}