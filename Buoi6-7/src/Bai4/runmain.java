package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> cbgvs = new ArrayList<CBGV>();

        System.out.println("MENU\n");
        System.out.println("1. Them moi giao vien");
        System.out.println("2. Xoa giao vien");
        System.out.println("3. Xuat danh sach giao vien");
        System.out.println("4. Thoat chuong trinh");

        int choose;
        do {
            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    CBGV.themCanBoGiaoVien(cbgvs);
                    break;
                case 2:
                    if (cbgvs.isEmpty()) {
                        System.out.println("Khong co giao vien nao");
                        break;
                    }
                    System.out.print("Nhap ma GV muon xoa: ");
                    int khac = sc.nextInt();
                    CBGV.xoaCanBoGiaoVienTheoMa(cbgvs, khac);
                    break;
                case 3:
                    if (cbgvs.isEmpty()) {
                        System.out.println("Khong co giao vien nao");
                        break;
                    }
                    CBGV.display(cbgvs);
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
