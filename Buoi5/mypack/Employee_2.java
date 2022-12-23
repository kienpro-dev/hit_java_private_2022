package mypack;

import java.util.Scanner;

public class Employee_2 {
    private String name;
    private int age;
    private String address;
    private float hoursWorked;
    private float hourlyRate;

    public Employee_2() {

    }

    public Employee_2(String name, int age, String address, int hoursWorked, int hourlyRate) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getHourlyRate() {
        return (float) (hourlyRate > 45 ? 45 + (hourlyRate - 45) * 1.5 : hourlyRate);
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // some deductive attributes below
    public float getSalary() {
        return getHoursWorked() * getHourlyRate();
    }

    public float getTax() {
        return (float) (getSalary() > 300 ? 0.02 : 0);
    }

    public float getIncome() {
        return getSalary() - getSalary() * getTax();
    }
    // some deductive attributes above

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        setName(sc.nextLine());
        System.out.print("Age: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Address: ");
        setAddress(sc.nextLine());
        System.out.print("Hours worked: ");
        setHoursWorked(sc.nextFloat());
        sc.nextLine();
        System.out.print("Hourly rate: ");
        setHourlyRate(sc.nextFloat());
        sc.nextLine();
    }

    public void display() {
        System.out.printf("%-20s %-5d %-10s %-15f %-15f %-15f %-15f\n", getName(), getAge(), getAddress(), getHoursWorked(), getHourlyRate(), getSalary(), getIncome());
    }

    public static Employee_2[] findByName(Employee_2[] employees,int n, String name) {
        Employee_2[] res = new Employee_2[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (employees[i].getName().toLowerCase().equals(name.toLowerCase())) {
                res[j++] = employees[i];
            }
        }
        return res;
    }

    public static void sortByHoursWorked(Employee_2[] employees, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(employees[i].getHoursWorked() < employees[j].getHoursWorked()) {
                    Employee_2 temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

}
