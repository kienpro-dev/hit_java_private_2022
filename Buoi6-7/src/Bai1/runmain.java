package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class runmain {
    public static void search(ArrayList<String> strs, String s) {
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).contains(s)) {
                System.out.println(strs.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so chuoi: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> strs = new ArrayList<String>();
        System.out.println("Nhap cac chuoi: ");
        for (int i = 0; i < n; i++) {
            strs.add(sc.nextLine());
        }
        System.out.print("Nhap chuoi con muon tim: ");
        String s = sc.nextLine();
        System.out.println("Cac chuoi chua chuoi con: ");
        search(strs, s);
    }
}
