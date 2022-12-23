package Buoi3;


import java.util.Scanner;

public class Buoi3_4 {
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean checkDigitPrime(int n) {
        while (n > 0) {
            int x = n % 10;
            if (x != 2 && x != 3 && x != 5 && x != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (checkDigitPrime(arr[i]) && checkPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                check = true;
            }
        }
        if (!check) {
            System.out.println("NO");
        }
    }
}
