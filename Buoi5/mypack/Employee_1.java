package mypack;

import java.util.Scanner;

public class Employee_1 {
    private static int cnt = 0;
    private int id;
    private String name;
    private String typeOfEmployee;
    private int workingDay;
    private int startYear;
    private int allowance = 100000;

    public Employee_1() {
        this.id = ++cnt;
    }

    public Employee_1(String name, String typeOfEmployee, int workingDay, int startYear) {
        this.id = ++cnt;
        this.name = name;
        this.typeOfEmployee = typeOfEmployee;
        this.workingDay = workingDay;
        this.startYear = startYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getAllowance() {
        return allowance + 200000*(2022 - getStartYear());
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    } 

    public double getSalary() {
        if (getTypeOfEmployee().toLowerCase().equals("san xuat")) {
            return 0.35 * getWorkingDay();
        } else if (getTypeOfEmployee().toLowerCase().equals("van phong")) {
            return 0.4 * getWorkingDay();
        }
        return 0;
    }

    public int getTotal() {
        return (int)(getSalary()*1000000) + getAllowance();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        setName(sc.nextLine());
        System.out.print("Type: ");
        setTypeOfEmployee(sc.nextLine());
        System.out.print("Working Day: ");
        setWorkingDay(sc.nextInt());
        sc.nextLine();
        System.out.print("Start Year: ");
        setStartYear(sc.nextInt());
        sc.nextLine();
    }

    public void display() {
        System.out.printf("%-10d %-20s %-10s %-15d %-15d %-15f %-10d %-10d\n",getId(),getName(),getTypeOfEmployee(),getWorkingDay(),getStartYear(),getSalary(), getAllowance(),getTotal());
    }

}
