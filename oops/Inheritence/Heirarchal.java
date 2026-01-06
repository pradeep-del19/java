import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Heirarchal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice (1-Dog, 2-Cat): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Dog d = new Dog();
            d.eat();
            d.bark();
        } else {
            Cat c = new Cat();
            c.eat();
            c.meow();
        }
    }
}
