package Bai1;

public class XeOto extends PhuongTienDiChuyen {
    public final double vt = 30 + Math.random()*50;

    private String loaiNhienLieu;

    public XeOto() {

    }

    public XeOto(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10s", this.loaiNhienLieu);
    }

    @Override
    public double layVanToc() {
        return vt;
    }
}

