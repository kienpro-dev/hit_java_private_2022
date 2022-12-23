import java.util.Scanner;
import mypack.Employee_1;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of employees: ");
        int n = sc.nextInt();
        Employee_1[] es = new Employee_1[n];

        for(int i = 0; i < n; i++) {
            es[i] = new Employee_1();
            es[i].input();
        }
        
        System.out.printf("%-10s %-20s %-10s %-15s %-15s %-15s %-10s %-10s\n","ID","Name","Type","Working Day","Start Year","Salary (million)","Allowance","Total");
        for(Employee_1 employee : es) {
            employee.display();
        }
    }
    
}
