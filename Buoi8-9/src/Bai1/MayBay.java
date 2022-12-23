package Bai1;

public class MayBay extends PhuongTienDiChuyen {
    public final double vt = 600 + Math.random() * 300;

    private String loaiNhienLieu;

    public MayBay() {

    }

    public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("May bay dang cat canh");
    }

    public void haCanh() {
        System.out.println("May bay dang ha canh");
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
