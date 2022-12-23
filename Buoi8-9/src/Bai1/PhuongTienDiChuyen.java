package Bai1;

public abstract class PhuongTienDiChuyen implements Comparable<PhuongTienDiChuyen> {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen() {

    } 

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return hangSanXuat.getTenHang();
    }

    public void batDau() {
        System.out.println("Phuong tien bat dau di chuyen");
    }

    public void tangToc() {
        System.out.println("Phuong tien dang tang toc");
    }

    public void dungLai() {
        System.out.println("Phuong tien da dung lai");
    }

    public abstract double layVanToc();

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-10.2f", this.loaiPhuongTien, this.hangSanXuat.getTenHang(), this.layVanToc());
    }

    @Override
    public int compareTo(PhuongTienDiChuyen o1) {
        return (int)(this.layVanToc() - o1.layVanToc());
    }

}
