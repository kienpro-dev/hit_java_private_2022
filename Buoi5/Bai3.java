import mypack.Student;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].input();
        }

        int choose;
        do {
            System.out.println("\n\n1: Sort and display list of students by their score");
            System.out.println("2: Find students by their name");
            System.out.println("3: Sort and display list of students by their name");
            System.out.println("4: Exit program\n");

            System.out.print("\nWhat do you want to do? Type your answer: ");
            choose = sc.nextInt();
            sc.nextLine();
            if (choose == 1) {
                Student.sortByScoreAsc(students);
                output(students);
            } else if (choose == 2) {
                System.out.print("\nwho do you want to find? Type your answer: ");
                String findName = sc.nextLine();
                Student[] res = Student.findByName(students, findName);
                if (res[0] == null) {
                    System.out.print("\nNot found");
                } else {
                    output(res);
                }
            } else if (choose == 3) {
                Student.sortByName(students);
                output(students);
            }
        } while (choose != 4);
    }

    public static void output(Student[] students) {
        System.out.printf("\n%-5s %-20s %-10s %-15s %-10s\n", "ID", "Name", "Address", "Phone number", "Score");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            System.out.println(students[i]);
        }
    }
}
