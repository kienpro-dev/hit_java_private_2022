package Buoi3;


import java.util.Scanner;

public class Buoi3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }

        int maX = 1;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] >= arr[i - 1]) {
                dp[i - 1] = dp[i] + 1;
            }
            maX = Math.max(maX, dp[i - 1]);
        }
        System.out.println(maX);
    }
}
