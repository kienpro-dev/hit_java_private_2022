package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> dshocsinh = new ArrayList<HocSinh>();
        System.out.println("MENU\n");
        System.out.println("1. Them sinh vien moi");
        System.out.println("2. Xuat ra danh sach sinh vien");
        System.out.println("3. Xuat ra danh sach sinh vien 20 tuoi");
        System.out.println("4. Xuat ra danh sach sinh vien 23 tuoi o DN");
        System.out.println("5. Sap xep sinh vien theo que quan");
        System.out.println("6. Ket thuc");
        int choose;
        do {
            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    HocSinh.themSv(dshocsinh);
                    break;
                case 2:
                    HocSinh.xuatCacSv(dshocsinh);
                    break;
                case 3:
                    HocSinh.xuatCacSv20Tuoi(dshocsinh);
                    break;
                case 4:
                    int cnt = HocSinh.demSinhVien23TuoiDaNang(dshocsinh);
                    System.out.println("So cac sv 23 tuoi o DN la: " + cnt);
                    break;
                case 5:
                    HocSinh.sapXepTheoQueQuan(dshocsinh);
                    HocSinh.xuatCacSv(dshocsinh);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lua chon k hop le");
                    break;
            }
        } while (choose != 6);

    }

}
