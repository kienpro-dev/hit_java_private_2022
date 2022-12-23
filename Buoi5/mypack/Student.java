package mypack;

import java.util.Scanner;

public class Student {
    private static int cnt = 0;
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private float score;

    public Student() {
        this.id = ++cnt;
    }

    public Student(String name, String address, String phoneNumber, float score) {
        this.id = ++cnt;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        setName(sc.nextLine());
        System.out.print("Address: ");
        setAddress(sc.nextLine());
        System.out.print("Phone number: ");
        setPhoneNumber(sc.nextLine());
        System.out.print("Score: ");
        setScore(sc.nextFloat());
        sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-10s %-15s %-10s", getId(), getName(), getAddress(), getPhoneNumber(), getScore());
    }

    public static void sortByScoreAsc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getScore() > students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public static Student[] findByName(Student[] students, String name) {
        Student[] res = new Student[students.length];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().toLowerCase().equals(name.toLowerCase())) {
                res[j++] = students[i];
            }
        }

        return res;
    }

    private static String separateName(String name) {
        String res = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            if (name.charAt(i) == ' ') {
                res += name.substring(i + 1, name.length());
                return res;
            }
        }
        return name;
    }

    public static void sortByName(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                int k = separateName(students[i].getName()).compareTo(separateName(students[j].getName()));
                if (k == 0) {
                    if (students[i].getName().compareTo(students[j].getName()) > 0) {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                } else if (k > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

}
