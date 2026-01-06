import java.util.Scanner;

class Animal {
    void eat(String food) {
        System.out.println("Eating: " + food);
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food: ");
        String food = sc.nextLine();

        Puppy p = new Puppy();
        p.eat(food);
        p.bark();
        p.play();
    }
}
