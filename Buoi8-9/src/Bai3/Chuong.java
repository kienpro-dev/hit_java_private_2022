package Bai3;

import java.util.ArrayList;

public class Chuong {
    public ArrayList<Animal> AnimalList;

    private int maChuong;
    
    public Chuong() {

    }

    public Chuong(int maChuong) {
        this.AnimalList = new ArrayList<Animal>();
        this.maChuong = maChuong;
    }

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public void themConVat(Animal a) {
        if(a instanceof Tiger) {
            a = new Tiger(a);
        } else if(a instanceof Dog) {
            a = new Dog(a);
        } else if(a instanceof Cat) {
            a = new Cat(a);
        }
        this.AnimalList.add(a);
    }

    public void xoaConVat(String name) {
        for (Animal a : AnimalList) {
            if(a.getTen().equalsIgnoreCase(name)) {
                AnimalList.remove(a);
                break;
            }
        }
    }

    public void display() {
        System.out.printf("%-15s %-10d %-10s\n", "Ten", "Tuoi", "Mo ta");
        for (Animal a : AnimalList) {
            a.xemThongTin();
        }
    }
}
