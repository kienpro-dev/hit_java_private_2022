package mypack;

import java.util.Scanner;

public class Car {
    private String owner;
    private String carName;
    private String brand;
    private float price;
    private int useYear;

    public Car() {

    }

    public Car(String owner, String carName, String brand, float price, int useYear) {
        this.owner = owner;
        this.carName = carName;
        this.brand = brand;
        this.price = price;
        this.useYear = useYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getUseYear() {
        return useYear;
    }

    public void setUseYear(int useYear) {
        this.useYear = useYear;
    }

    public float getCurrentPrice() {
        return getPrice() - (getPrice() * getUseYear()
                * (getPrice() < 1 ? (float) 0.07 : (getPrice() <= 2 ? (float) 0.05 : (float) 0.03)));
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Owner: ");
        setOwner(sc.nextLine());
        System.out.print("Car's name: ");
        setCarName(sc.nextLine());
        System.out.print("Car's brand: ");
        setBrand(sc.nextLine());
        System.out.print("Price: ");
        setPrice(sc.nextFloat());
        sc.nextLine();
        System.out.print("Year of use: ");
        setUseYear(sc.nextInt());
        sc.nextLine();
    }

    public void display() {
        System.out.printf("%-20s %-15s %-15s %-15f %-15d %-15f\n", getOwner(), getCarName(), getBrand(), getPrice(), getUseYear(), getCurrentPrice());
    }

    public static void sortCarByCurrentPriceDesc(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getCurrentPrice() < cars[j].getCurrentPrice()) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    public static void displayCarOutOfPrice(Car[] cars) {
        System.out.println("LIST CARS OUT OF PRICE");
        for (Car car : cars) {
            if (car.getCurrentPrice() <= 0) {
                System.out.printf("%-20s %-15s %-15s %-15f %-15d %-15f\n", car.getOwner(), car.getCarName(), car.getBrand(), car.getPrice(), car.getUseYear(), car.getCurrentPrice());
            }
        }
    }
}
