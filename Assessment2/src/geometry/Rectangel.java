package geometry;

public class Rectangel extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangel() {
	}
	
	public Rectangel(double width, double length) {
		if(width <= 0 || length <= 0) {
			throw new ArithmeticException("Width and Length must be greater than 0");
		} else {
			this.width = width;
			this.length = length;
		}
	}
	
	public Rectangel(String color, boolean filled, double width, double length) {
		if(width <= 0 || length <= 0) {
			throw new ArithmeticException("Width and Length must be greater than 0");
		} else {
			super.color = color;
			super.filled = filled;
			this.width = width;
			this.length = length;
		}
	}

	double getWidth() {
		return this.width;
	}
	
	void setWidth(double width) {
		if(width <= 0) {
			throw new ArithmeticException("Width must be greater than 0");
		} else {
			this.width = width;
		}
	}
	
	double getLength() {
		return this.length;
	}
	
	void setLength(double length) {
		if(length <= 0) {
			throw new ArithmeticException("Length must be greater than 0");
		} else {
			this.length = length;
		}
	}
	
	@Override
	double getArea() {
		return this.width * this.length;
	}

	@Override
	double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	public String toString() {
		return "Rectangel[Shape[color="+super.color+",filled="+super.filled+"],width="+getWidth()+",length="+getLength()+"]";
	}
}
