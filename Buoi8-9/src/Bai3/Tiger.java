package Bai3;

public class Tiger extends Animal {

    public Tiger() {

    }

    public Tiger(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }

    public Tiger(Animal a) {
        super(a);
    }

    @Override
    public void xemThongTin() {
        System.out.printf("%-15s %-10d %-10s\n", this.getTen(), this.getTuoi(), this.getMoTa());
    }

    @Override
    public void tiengKeu() {
        System.out.println("Grrr Grrr");
    }

}
