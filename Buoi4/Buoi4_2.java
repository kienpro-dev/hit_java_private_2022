package Buoi4;
import java.util.Scanner;

public class Buoi4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 1; j <= s2.length(); j++) {
                String temp = s2.substring(i, j);
                if (s1.indexOf(temp) > -1 && temp.length() > cnt) {
                    cnt = temp.length();
                }
            }
        }
        System.out.println(cnt);
    }
}
