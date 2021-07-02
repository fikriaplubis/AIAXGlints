package geometry;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			List<Circle> dataCircle = new ArrayList<>();
			List<Rectangel> dataRectangel = new ArrayList<>();
			List<Square> dataSquare = new ArrayList<>();
			
			Circle circle1 = new Circle();
			Circle circle2 = new Circle(4.0);
			Circle circle3 = new Circle("blue", true, 4.0);
			System.out.println("Area Circle = " + circle2.getArea());
			System.out.println("Perimeter Circle = " + circle2.getPerimeter());
			dataCircle.add(circle1);
			dataCircle.add(circle2);
			dataCircle.add(circle3);
			System.out.println(dataCircle);
			
			Rectangel rectangel1 = new Rectangel();
			Rectangel rectangel2 = new Rectangel(2.0, 2.0);
			Rectangel rectangel3 = new Rectangel("blue", true, 3.0, 2.0);
			System.out.println("Area Rectangel = " + rectangel2.getArea());
			System.out.println("Perimeter Rectangel = " + rectangel2.getPerimeter());
			dataRectangel.add(rectangel1);
			dataRectangel.add(rectangel2);
			dataRectangel.add(rectangel3);
			System.out.println(dataRectangel);
			
			Square square1 = new Square();
			Square square2 = new Square(5.0);
			Square square3 = new Square("blue", true, 3.0);
			System.out.println("Area Square = " + square2.getArea());
			System.out.println("Perimeter Square = " + square2.getPerimeter());
			dataSquare.add(square1);
			dataSquare.add(square2);
			dataSquare.add(square3);
			System.out.println(dataSquare);
			
		} catch (ArithmeticException error) {
			System.out.println(error);
;		}
	}
}
