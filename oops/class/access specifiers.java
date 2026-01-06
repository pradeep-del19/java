import java.util.Scanner;
class Student{
    private String name;        
    protected int age;          
    public String grade;        
    String school;               
    Student(String name, int age, String grade, String school){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.school = school;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        System.out.println("School: "+school);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=sc.nextLine();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter grade: ");
        String grade=sc.nextLine();
        System.out.print("Enter school name: ");
        String school=sc.nextLine();
        Student s=new Student(name, age, grade, school);
        s.display();
    }
}
