package Buoi4;
import java.util.Scanner;

public class Buoi4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean check = false;
        int cnt = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += (s.charAt(i) - 48);
                cnt++;
                check = true;
            }
        }
        if (!check) {
            System.out.println("False");
        } else {
            System.out.println("True");
            System.out.format("%.3f", sum * 1.0 / cnt);
        }
    }
}
