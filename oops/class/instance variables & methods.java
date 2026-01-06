import java.util.Scanner;
class Car{
    String color;
    String brand;
    Car(String c, String b){
        color = c;
        brand = b;
    }
    void describe(){
        System.out.println("This car is a "+color+ " " +brand);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car color: ");
        String color = sc.nextLine();
        System.out.print("Enter car brand: ");
        String brand=sc.nextLine();
        Car myCar = new Car(color, brand);
        myCar.describe();
        sc.close();
    }
}
