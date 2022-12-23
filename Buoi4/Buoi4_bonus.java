package Buoi4;
import java.util.Scanner;

public class Buoi4_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                sum++;
            } else if (s.charAt(i) == 'V') {
                sum += 5;
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    sum--;
                    i--;
                }
            } else if (s.charAt(i) == 'X') {
                sum += 10;
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    sum--;
                    i--;
                }
            } else if (s.charAt(i) == 'L') {
                sum += 50;
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    sum -= 10;
                    i--;
                }
            } else if (s.charAt(i) == 'C') {
                sum += 100;
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    sum -= 10;
                    i--;
                }
            } else if (s.charAt(i) == 'D') {
                sum += 500;
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    sum -= 100;
                    i--;
                }
            } else if (s.charAt(i) == 'M') {
                sum += 1000;
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    sum -= 100;
                    i--;
                }
            }
        }

        // int[] num = new int[]{1,5,10,50,100,500,1000};
        // char[] c = new char[]{'I','V','X','L','C','D','M'};
        // int[] def = new int[]{0,1,1,10,10,100,100};

        // for(int i = 0; i<s.length();i++) {
        //     for(int j = 0;j<7;j++) {
        //         if(s.charAt(i) == c[j]) {
        //             sum += num[j];
        //             if((j == 0 || j == 2 || j == 4) && (j + 1 == 1) ) {

        //             }
        //         }
        //     }
        // }
        System.out.println(sum);
    }
}
