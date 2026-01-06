import java.util.Scanner;
class Car{
    String color;
    String model;
    Car(String color, String model){
        this.color = color;
        this.model = model;
    }
    void display(){
        System.out.println("Car color: "+color+",Model: "+model);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter car color: ");
        String color=sc.nextLine();
        System.out.print("Enter car model: ");
        String model=sc.nextLine();
        Car myCar=new Car(color, model);
        myCar.display();
    }
}
