package Buoi2;

import java.util.Scanner;

public class Buoi2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n <= 0);
        boolean check = false;
        int[] arr = new int[100];
        int i = 0;
        while (n > 0) {
            if (Math.sqrt(n % 10) == (int) Math.sqrt(n % 10)) {
                arr[i++] = n % 10;
                check = true;
            }
            n /= 10;
        }
        if (!check) {
            System.out.println("No");
        } else {
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
