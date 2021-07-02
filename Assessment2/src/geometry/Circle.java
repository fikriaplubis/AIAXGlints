package geometry;

public class Circle extends Shape {
	private double radius = 1.0;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		if(radius <= 0) {
			throw new ArithmeticException("Radius must be greater than 0");
		} else {
			this.radius = radius;
		}
	}
	
	public Circle(String color, boolean filled, double radius) {
		if(radius <= 0) {
			throw new ArithmeticException("Radius must be greater than 0");
		} else {
			super.color = color;
			super.filled = filled;
			this.radius = radius;
		}
	}
	
	double getRadius() {
		return this.radius;
	}
	
	void setRadius(double radius) {
		if(radius <= 0) {
			throw new ArithmeticException("Radius must be greater than 0");
		} else {
			this.radius = radius;
		}
	}
	
	@Override
	double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public String toString() {
		return "Circle[Shape[color="+super.color+",filled="+super.filled+"],radius="+getRadius()+"]";
	}
}
