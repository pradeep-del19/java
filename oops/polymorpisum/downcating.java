class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child specific method");
    }
}

public class downcating{
    public static void main(String[] args) {

        Parent p = new Child();

        Child c = (Child) p;
        c.childMethod();
    }
}
