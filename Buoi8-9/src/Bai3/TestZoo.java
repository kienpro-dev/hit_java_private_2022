package Bai3;

import java.util.Scanner;

public class TestZoo {
    public static ZooService zs = new ZooImpl();

    public static void main(String[] args) {
        System.out.println("MENU\n1. Thêm chuồng\n" + "2. Xóa chuồng\n" + "3. Thêm con vật\n" + "4. Xóa con vật\n"
                + "5. Xem tất cả các con vật" + "\n6. Thoát");
        int choose;
        do {

            System.out.print("Nhập lựa chọn: ");
            choose = new Scanner(System.in).nextInt();

            switch (choose) {
                case 1:
                    zs.themChuongMoi();
                    break;
                case 2:
                    zs.xoaChuongCu();
                    break;
                case 3:
                    zs.themConVatMoi();
                    break;
                case 4:
                    zs.xoaConVatCu();
                    break;
                case 5:
                    zs.xemZoo();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lựa chọn chưa có sẵn");
            }
        } while (choose != 6);
    }

}
