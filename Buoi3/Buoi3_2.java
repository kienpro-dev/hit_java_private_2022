package Buoi3;

import java.util.Scanner;

public class Buoi3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if ((arr[n - 1] + arr[0]) * n / 2 == sum) {
            System.out.println("YES");
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 1) {
                    for (int j = 1; j < arr[i] - arr[i - 1]; j++) {
                        System.out.print((arr[i - 1] + j) + " ");
                    }
                }
            }
        }
    }
}
