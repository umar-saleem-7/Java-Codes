import java.util.Scanner;

class Car {
    private String model;
    private String make;
    private int year;
    private double price;

    public Car() {
        this.model = "Honda";
        this.make = "Unknown";
        this.year = 2022;
        this.price = 16500000.0;
    }

    public Car(String model, String make, int year, double price) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputData() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Car Model: ");
        this.model = in.nextLine();
        
        System.out.print("Enter Car Make: ");
        this.make = in.nextLine();
        
        System.out.print("Enter Car Year: ");
        this.year = in.nextInt();
        
        System.out.print("Enter Car Price: ");
        this.price = in.nextDouble();
    }

    public void showData() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Make: " + make);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: Rs. " + price);
        System.out.println("---------------------------------");
    }
}

public class Task4{
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        System.out.println("Please Enter the details for 5 cars: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Car " + (i + 1) + " Details:");
            cars[i] = new Car();
            cars[i].inputData();
        }

        System.out.println("\nEntered Car Details:");
        for (int i = 0; i < 5; i++){
            cars[i].showData();
        }

        Car most_Exp_Car = cars[0];

        for (int i = 1; i < 5; i++) {
            if (cars[i].getPrice() > most_Exp_Car.getPrice()) {
                most_Exp_Car = cars[i];
            }
        }

        System.out.println("\nMost Expensive Car is :");
        most_Exp_Car.showData();
    }
}
