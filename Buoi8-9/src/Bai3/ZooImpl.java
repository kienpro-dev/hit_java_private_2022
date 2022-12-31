package Bai3;

import java.util.Scanner;

public class ZooImpl implements ZooService {

    public static Zoo zoo = new Zoo();
    public static Scanner sc = new Scanner(System.in);

    @Override
    public void themChuongMoi() {
        System.out.print("Nhap ma chuong: ");
        int mc = sc.nextInt();
        Chuong c = new Chuong(mc);
        zoo.themChuong(c);
        
    }

    @Override
    public void xoaChuongCu() {
        System.out.print("Nhap ma chuong: ");
        int mc = sc.nextInt();
        zoo.xoaChuong(mc);
        
    }

    @Override
    public void themConVatMoi() {
        System.out.print("Nhap ma chuong: ");
        int mc = sc.nextInt();
        sc.nextLine();
        for (Chuong c : zoo.DanhSachChuong) {
            if(c.getMaChuong() == mc) {
                Animal a;
                System.out.print("Nhap ten loai muon them(tiger, dog, cat): ");
                String l = sc.next();
                if(l.equalsIgnoreCase("tiger")) 
                    a = new Tiger();
                else if(l.equalsIgnoreCase("dog"))
                    a = new Dog();
                else if(l.equalsIgnoreCase("cat"))
                    a = new Cat();
                else {
                    System.out.println("Loai vat chua duoc ho tro");
                    break;
                }
                a.input();
                c.themConVat(a);
                break;
            }
        }
        
    }

    @Override
    public void xoaConVatCu() {
        System.out.print("Nhap ma chuong: ");
        int mc = sc.nextInt();
        sc.nextLine();
        for (Chuong c : zoo.DanhSachChuong) {
            if(c.getMaChuong() == mc) {
                System.out.print("Nhap ten loai muon xoa: ");
                String ten = sc.nextLine();
                c.xoaConVat(ten);
                break;
            }
        }
    }

    @Override
    public void xemZoo() {
        zoo.display();
    }
    
}
