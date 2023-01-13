package Bai1;

import java.util.*;

public class runmain {

    public static int solve(String s) {
        int cnt1 = 0; // dem ngoac (
        int cnt2 = 0; // dem ngoac )
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt1++;
            } else {
                if (cnt1 > 0) {
                    cnt1--;
                } else {
                    cnt2++;
                }
            }
        }
        return cnt1 + cnt2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
}
