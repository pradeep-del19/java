class Parent{
    void show(){
        System.out.println("This is parent class method");
    }
}
class Child extends Parent{
    void show(){
        super.show();
        System.out.println("This is child class method");
    }
}
public class Main{
    public static void main(String[] args){
        Child c = new Child();
        c.show();
    }
}
