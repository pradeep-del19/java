import java.util.Scanner;
class Car {
    String color;           
    String brand;           
    static int carCount = 0; 
    Car(String color,String brand){
        this.color = color;
        this.brand = brand;
        carCount++;         
    }
    void showCarInfo(){
        System.out.println("Car: " + color + " " + brand);
    }
    static void showTotalCars(){
        System.out.println("Total cars created: " + carCount);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many cars do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Car[] cars = new Car[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter color for car " +(i+1)+ ": ");
            String color=sc.nextLine();
            System.out.print("Enter brand for car " +(i+1)+ ": ");
            String brand=sc.nextLine();
            cars[i]=new Car(color, brand);
        }
        System.out.println("\n--- Car Details ---");
        for (int i = 0; i < n; i++) {
            cars[i].showCarInfo();  
        }
        Car.showTotalCars();

        sc.close();
    }
}
