package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class CBGV extends Nguoi {
    public static Scanner sc = new Scanner(System.in);

    private int luongCung;
    private int luongThuong;
    private int luongPhat;

    public CBGV() {

    }

    public CBGV(int maGV, String hoTen, int tuoi, String queQuan, int luongCung, int luongThuong, int luongPhat) {
        super(maGV, hoTen, tuoi, queQuan);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }

    public int getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(int luongPhat) {
        this.luongPhat = luongPhat;
    }

    public int getLuongThuc() {
        return getLuongCung() + getLuongThuong() - getLuongPhat();
    }

    public void input() {
        System.out.print("Nhap ma GV: ");
        setMaGV(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten GV: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap tuoi GV: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap que quan GV: ");
        setQueQuan(sc.nextLine());
        System.out.print("Nhap luong cung GV: ");
        setLuongCung(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap luong thuong GV: ");
        setLuongThuong(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap luong phat GV: ");
        setLuongPhat(sc.nextInt());
        sc.nextLine();
    }

    public void output() {
        System.out.printf("%-10d %-20s %-5d %-15s %-15d\n", getMaGV(), getHoTen(), getTuoi(), getQueQuan(), getLuongThuc());
    }

    public static void title() {
        System.out.printf("%-10s %-20s %-5s %-15s %-15s\n", "Ma GV", "Ho Ten", "Tuoi", "Que Quan", "Luong");
    }

    public static void display(ArrayList<CBGV> cbgvs) {
        title();
        for (CBGV cbgv : cbgvs) {
            cbgv.output();
        }
        //cbgvs.forEach((CBGV cbgv)->{cbgv.output();});
    }

    public static void themCanBoGiaoVien(ArrayList<CBGV> cbgvs) {
        CBGV khac = new CBGV();
        khac.input();
        cbgvs.add(khac);
        System.out.println("Them thanh cong!!!");
    }

    public static void xoaCanBoGiaoVienTheoMa(ArrayList<CBGV> cbgvs, int khac) {
        boolean check = false;
        for (int i = 0; i < cbgvs.size(); i++) {
            if (cbgvs.get(i).getMaGV() == khac) {
                cbgvs.remove(cbgvs.get(i));
                check = true;
            }
        }
        if (check) {
            System.out.println("Xoa thanh cong!!!");
        } else {
            System.out.println("Khong co giao vien co ma " + khac);
        }
    }
}
