
package Buoi2;
public class Buoi2_3 {
    public static void main(String[] args) {
        // int buffalo = 100;
        // int grass = 100;
        // int casee = 0;
        // for (int i = 1; i <= 20; i++) {
        //     for (int j = 1; j <= 33; j++) {
        //         int k = 100 - i - j;
        //         if (i + j + k == buffalo && 15 * i + 9 * j + k == grass * 3) {
        //             System.out.println("TH" + ++casee);
        //             System.out.println("Trau dung: " + i);
        //             System.out.println("TRau nam: " + j);
        //             System.out.println("Trau gia: " + k);
        //         }
        //     }
        // }
        for (int x = 1; x < 20; x++) {
            if (3 * x % 4 != 0) {
                continue;
            }
            int y = 25 - 7 * x / 4;
            if (y < 0) {
                continue;
            }
            System.out.println(x + " " + y + " " + (6 * x + 3 * y));
        }
    }
}
