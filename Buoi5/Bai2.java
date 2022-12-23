import java.util.Scanner;
import mypack.Car;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of cars: ");
        int n = sc.nextInt();
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car();
            cars[i].input();
        }

        Car.sortCarByCurrentPriceDesc(cars);

        System.out.printf("\n%-20s %-15s %-15s %-15s %-15s %-15s\n", "Owner", "Car's name", "Car's brand", "Price(billion)", "Year of use", "Current price(billion)");
        for (Car car : cars) {
            car.display();
        }

        Car.displayCarOutOfPrice(cars);
    }
}
