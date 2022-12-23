package Bai1;

public class HangSanXuat {
    private String tenHang;
    private String tenQuocGia;

    public HangSanXuat(String tenHang, String tenQuocGia) {
        this.tenHang = tenHang;
        this.tenQuocGia = tenQuocGia;
    }

    public HangSanXuat() {
    
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
