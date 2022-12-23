package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> dsts = new ArrayList<ThiSinh>();
        System.out.println("MENU\n");
        System.out.println("1. Them moi thi sinh");
        System.out.println("2. Xuat ra danh sach thi sinh");
        System.out.println("3. Tim kiem sinh vien theo SBD");
        System.out.println("4. Thoat chuong trinh");

        int choose;
        do {
            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    ThiSinh ts = new ThiSinh();
                    ThiSinh.themThiSinh(dsts, ts);
                    break;
                case 2:
                    ThiSinh.xuatCacThisinh(dsts);
                    break;
                case 3:
                    System.out.print("Nhap SBD muon tim: ");
                    int other_sbd = sc.nextInt();
                    sc.nextLine();
                    ThiSinh timThiSinh = ThiSinh.timThiSinhTheoSbd(dsts, other_sbd);
                    if (timThiSinh == null) {
                        System.out.println("Khong tim thay thi sinh");
                    } else {
                        timThiSinh.output();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lua chon k hop le");
                    break;
            }
        } while (choose != 4);

    }
}
