package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ThiSinh {
    public static Scanner sc = new Scanner(System.in);

    private int sbd;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;
    private KhoiThi khoi = new KhoiThi();

    public ThiSinh() {

    }

    public ThiSinh(int sbd, String hoTen, String diaChi, String mucUuTien, KhoiThi khoi) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.khoi = khoi;
    }

    public int getSbd() {
        return sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public KhoiThi getKhoi() {
        return khoi;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public void setKhoi(KhoiThi khoi) {
        this.khoi = khoi;
    }

    public String locKhoi(ThiSinh ts) {
        String khoiThi;

        ArrayList<String> monThiKhoiA = new ArrayList<String>();
        monThiKhoiA.add("toan");
        monThiKhoiA.add("ly");
        monThiKhoiA.add("hoa");

        ArrayList<String> monThiKhoiB = new ArrayList<String>();
        monThiKhoiA.add("toan");
        monThiKhoiA.add("hoa");
        monThiKhoiA.add("sinh");

        ArrayList<String> monThiKhoiC = new ArrayList<String>();
        monThiKhoiA.add("van");
        monThiKhoiA.add("su");
        monThiKhoiA.add("dia");

        if(monThiKhoiA.contains(ts.getKhoi().getMon1().toLowerCase()) && monThiKhoiA.contains(ts.getKhoi().getMon2().toLowerCase()) && monThiKhoiA.contains(ts.getKhoi().getMon3().toLowerCase())) {
            khoiThi = "A";
        } else if (monThiKhoiB.contains(ts.getKhoi().getMon1().toLowerCase()) && monThiKhoiB.contains(ts.getKhoi().getMon2().toLowerCase()) && monThiKhoiB.contains(ts.getKhoi().getMon3().toLowerCase())) {
            khoiThi = "B";
        } else if (monThiKhoiC.contains(ts.getKhoi().getMon1().toLowerCase()) && monThiKhoiC.contains(ts.getKhoi().getMon2().toLowerCase()) && monThiKhoiC.contains(ts.getKhoi().getMon3().toLowerCase())) {
            khoiThi = "C";
        } else {
            khoiThi = "Khong xac dinh";
        }

        return khoiThi;
    }

    public void input() {
        System.out.print("Nhap SBD: ");
        setSbd(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.print("Nhap muc uu tien: ");
        setMucUuTien(sc.nextLine());
        System.out.println("Nhap cac mon thi: ");
        System.out.print("Mon 1: ");
        getKhoi().setMon1(sc.nextLine());
        System.out.print("Mon 2: ");
        getKhoi().setMon2(sc.nextLine());
        System.out.print("Mon 3: ");
        getKhoi().setMon3(sc.nextLine());
    }

    public void output() {
        System.out.printf("%-5d %-25s %-15s %-15s %s\n",this.getSbd(), this.getHoTen(), this.getDiaChi(), this.getMucUuTien(), this.locKhoi(this));
    }

    public static void themThiSinh(ArrayList<ThiSinh> dsts, ThiSinh ts) {
        ts.input();
        dsts.add(ts);
    }

    public static void title() {
        System.out.printf("%-5s %-25s %-15s %-15s %s\n","SBD", "Ho Ten", "Dia Chi", "Muc Uu Tien", "Khoi Thi");
    }

    public static void xuatCacThisinh(ArrayList<ThiSinh> dsts) {
        if(dsts.isEmpty()) {
            System.out.println("Khong co thi sinh nao");
            return;
        }
        title();
        for(ThiSinh ts:dsts) {
            ts.output();
        }
    }

    public static ThiSinh timThiSinhTheoSbd(ArrayList<ThiSinh> dsts, int other_sbd) {
        for (ThiSinh thiSinh : dsts) {
            if(thiSinh.getSbd() == other_sbd) {
                return thiSinh;
            }
        }
        return null;
    }

}
