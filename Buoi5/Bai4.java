import java.util.Scanner;
import mypack.Employee_2;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Number of employees: ");
        int n = 0;
        Employee_2[] es = new Employee_2[1000];

        // for (int i = 0; i < n; i++) {
        // es[i] = new Employee_2();
        // es[i].input();
        // }

        int choose;
        do {
            System.out.println("\n\n1: Add one more employee");
            System.out.println("2: Display list of employees");
            System.out.println("3: Display list of Top 3 hardest employees");
            System.out.println("4: Find employees by their name");
            System.out.println("5: Exit program\n");

            System.out.print("\nWhat do you want to do? Type your answer: ");
            choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) {
                es[n] = new Employee_2();
                es[n++].input();
            } else if (choose == 2) {
                if (n == 0) {
                    System.out.println("Do not have any employees, please add more employees");
                } else {
                    output(es, n);
                }

            } else if (choose == 3) {
                if (n == 0) {
                    System.out.println("Do not have any employees, please add more employees");
                } else if (n < 3) {
                    System.out.println("Do not have enough 3 employees, please add more employees");
                } else {
                    Employee_2.sortByHoursWorked(es, n);
                    output(es, 3);
                }

            } else if (choose == 4) {
                if (n == 0) {
                    System.out.println("Do not have any employees, please add more employees");
                } else {
                    System.out.print("\nwho do you want to find? Type your answer: ");
                    String findName = sc.nextLine();
                    Employee_2[] res = Employee_2.findByName(es, n, findName);
                    if (res[0] == null) {
                        System.out.print("\nNot found");
                    } else {
                        output(res, res.length);
                    }
                }
            }

        } while (choose != 5);
    }

    public static void output(Employee_2[] es, int n) {
        System.out.printf("\n%-20s %-5s %-10s %-15s %-15s %-15s %-15s\n", "Name", "Age", "Address", "Hours worked",
                "Hourly rate", "Salary", "Income after fax");
        for (int i = 0; i < n; i++) {
            if (es[i] == null) {
                break;
            }
            es[i].display();
        }
    }
}
