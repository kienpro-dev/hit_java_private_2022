package Bai1;

import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<PhuongTienDiChuyen> list = new ArrayList<PhuongTienDiChuyen>();
        HangSanXuat h1 = new HangSanXuat("Airbus", "Toulouse");
        HangSanXuat h2 = new HangSanXuat("Antonov", "Ukraina");
        HangSanXuat h3 = new HangSanXuat("Boeing", "USA");
        HangSanXuat h4 = new HangSanXuat("Mercedesc", "USA");
        HangSanXuat h5 = new HangSanXuat("Ferrari", "Italy");
        HangSanXuat h6 = new HangSanXuat("Merida", "Taiwan");

        list.add(new MayBay("May Bay", h1, "Jet A"));
        list.add(new MayBay("May Bay", h2, "Jet A"));
        list.add(new MayBay("May Bay", h3, "Jet B"));

        list.add(new XeOto("O to", h4, "Ron 95"));
        list.add(new XeOto("O to", h5, "Ron 97"));

        list.add(new XeDap("Xe dap", h6));

        list.forEach((PhuongTienDiChuyen pt) -> {System.out.println(pt);});

        Collections.sort(list);
        System.out.println("Phuong tien co toc do lon nhat:\n" + list.get(list.size() - 1));
    }

}
