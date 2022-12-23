package Bai3;

import java.util.Scanner;
import java.util.ArrayList;

public class HocSinh {
    private Lop lopHoc = new Lop();
    private String hoTen;
    private int tuoi;
    private String queQuan;

    public HocSinh() {

    }

    public HocSinh(Lop lopHoc, String hoTen, int tuoi, String queQuan) {
        this.lopHoc = lopHoc;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public Lop getLop() {
        return lopHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setLop(Lop lopHoc) {
        this.lopHoc = lopHoc;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lop: ");
        lopHoc.setMaLop(sc.nextLine());
        System.out.print("Nhap ten lop: ");
        lopHoc.setTenLop(sc.nextLine());
        System.out.print("Nhap ho ten sv: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap tuoi sv: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap que quan: ");
        setQueQuan(sc.nextLine());
    }

    public void output() {
        System.out.printf("%-10s %-10s %-25s %-5d %-10s\n", lopHoc.getMaLop(), lopHoc.getTenLop(),getHoTen(), getTuoi(), getQueQuan());
    }

    public static void themSv(ArrayList<HocSinh> dshocsinh) {
        HocSinh hs = new HocSinh();
        hs.input();
        dshocsinh.add(hs);
    }

    private static void title() {
        System.out.printf("%-10s %-10s %-25s %-5s %-10s\n", "Ma lop", "Ten lop", "Ho ten", "Tuoi", "Que quan");
    }

    public static void xuatCacSv(ArrayList<HocSinh> dshocsinh) {
        if (dshocsinh.isEmpty()) {
            System.out.println("Chua co sinh vien nao");
            return;
        }
        title();
        for (int i = 0; i < dshocsinh.size(); i++) {
            dshocsinh.get(i).output();
        }
    }

    public static void xuatCacSv20Tuoi(ArrayList<HocSinh> dshocsinh) {
        if (dshocsinh.isEmpty()) {
            System.out.println("Chua co sinh vien nao");
            return;
        }
        title();
        for (int i = 0; i < dshocsinh.size(); i++) {
            if (dshocsinh.get(i).getTuoi() == 20) {
                dshocsinh.get(i).output();
            }
        }
    }

    public static int demSinhVien23TuoiDaNang(ArrayList<HocSinh> dshocsinh) {
        if (dshocsinh.isEmpty()) {
            System.out.println("Chua co sinh vien nao");
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < dshocsinh.size(); i++) {
            if (dshocsinh.get(i).getTuoi() == 23 && dshocsinh.get(i).getQueQuan().equals("DN")) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void sapXepTheoQueQuan(ArrayList<HocSinh> dshocsinh) {
        if (dshocsinh.size() > 1) {
            for (int i = 0; i < dshocsinh.size() - 1; i++) {
                for (int j = i + 1; j < dshocsinh.size(); j++) {
                    if (dshocsinh.get(i).getQueQuan().compareTo(dshocsinh.get(j).getQueQuan()) > 0) {
                        HocSinh temp = dshocsinh.get(i);
                        dshocsinh.set(i, dshocsinh.get(j));
                        dshocsinh.set(j, temp);
                    }
                }
            }
        } else {
            System.out.println("Can co 2 du lieu sinh vien tro len de tien hanh sap xep");
        }
    }

}
