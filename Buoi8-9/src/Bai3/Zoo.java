package Bai3;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Chuong> DanhSachChuong = new ArrayList<Chuong>();

    private String ten;

    public Zoo() {

    }

    public Zoo(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void themChuong(Chuong c) {
        this.DanhSachChuong.add(c);
    }

    public void xoaChuong(int maChuong) {
        for (Chuong c : DanhSachChuong) {
            if (c.getMaChuong() == maChuong) {
                DanhSachChuong.remove(c);
                break;
            }
        }
    }

    public void display() {
        for (Chuong c : DanhSachChuong) {
            System.out.println("Cac con vat trong chuong " + c.getMaChuong() + ":");
            c.display();
        }
    }
}
