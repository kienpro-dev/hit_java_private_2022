package Bai3;

public abstract class Animal {
    private String ten;
    private int tuoi;
    private String moTa;

    public Animal() {

    }

    public Animal(String ten, int tuoi, String moTa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.moTa = moTa;
    }

    public Animal(Animal a) {
        this(a.getTen(), a.getTuoi(), a.getMoTa());
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public abstract void xemThongTin();

    public abstract void tiengKeu();

}
