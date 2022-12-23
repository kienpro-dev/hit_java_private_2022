package Buoi4;
import java.util.Scanner;

public class Buoi4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim().toLowerCase();
        String ans = "";
        boolean haveSpace = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                continue;
            }
            if (s.charAt(i) == ' ' && !haveSpace) {
                ans += ' ';
                haveSpace = true;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                haveSpace = false;
                if ((ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') || ans.length() == 0) {
                    ans += (char) (s.charAt(i) - 32);
                } else {
                    ans += s.charAt(i);
                }
            }
        }
        System.out.println(ans);
    }
}
