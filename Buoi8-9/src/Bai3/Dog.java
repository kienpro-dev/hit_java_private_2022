package Bai3;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }

    public Dog(Animal a) {
        super(a);
    }

    @Override
    public void xemThongTin() {
        System.out.printf("%-15s %-10d %-10s", this.getTen(), this.getTuoi(), this.getMoTa());
    }

    @Override
    public void tiengKeu() {
        System.out.println("Gau Gau");
    }

}
