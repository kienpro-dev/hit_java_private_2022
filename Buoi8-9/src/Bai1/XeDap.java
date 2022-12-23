package Bai1;

public class XeDap extends PhuongTienDiChuyen{
    public final double vt = (10 + Math.random()*20);

    public XeDap() {

    }

    public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double layVanToc() {
        return vt;
    }
    
}
