package Bai3;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }

    public Cat(Animal a) {
        super(a);
    }

    @Override
    public void xemThongTin() {
        System.out.printf("%-15s %-10d %-10s", this.getTen(), this.getTuoi(), this.getMoTa());
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meow Meow");
    }
}
