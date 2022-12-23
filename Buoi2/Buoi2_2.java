package Buoi2;

import java.util.Scanner;

public class Buoi2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("Khong co so lon thu hai");
            return;
        }
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }

        int secondMax = min;
        if (a != max && secondMax < a) {
            secondMax = a;
        }
        if (b != max && secondMax < b) {
            secondMax = b;
        }
        if (c != max && secondMax < c) {
            secondMax = c;
        }
        if (d != max && secondMax < d) {
            secondMax = d;
        }

        System.out.println(secondMax);
    }
}
