import java.util.Scanner;
class Animal {
    void eat(String food) {
        System.out.println("Animal eating " + food);
    }
}
class Dog extends Animal {
    void bark(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Dog barking");
        }
    }
}
public class Inheritence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the food name: ");
        String food = sc.nextLine();
        System.out.print("the number of barks: ");
        int times = sc.nextInt();
        Dog d = new Dog();
        d.eat(food);
        d.bark(times);
    }
}

