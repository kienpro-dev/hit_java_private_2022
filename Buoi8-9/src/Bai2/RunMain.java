package Bai2;

import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {
		ArrayList<IShape> list = new ArrayList<IShape>();
		list.add(new Rectangle(3.4, 5.3)); 
		list.add(new Circle(5.5));
		list.add(new Rectangle(7.4, 4.3));
		for (IShape shape : list) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
	}
}
