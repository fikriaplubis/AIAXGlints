package geometry;

public class Square extends Rectangel {
	public Square() {
	}
	
	public Square(double side) {
		if(side <= 0) {
			throw new ArithmeticException("Side must be greater than 0");
		} else {
			super.width = side;
			super.length = side;
		}
	}

	public Square(String color, boolean filled, double side) {
		if(side < 0) {
			throw new ArithmeticException("Side must be greater than 0");
		} else {
			super.color = color;
			super.filled = filled;
			super.width = side;
			super.length = side;
		}
	}

	public double getSide() {
		return super.width;
	}

	public void setSide(double side) {
		if(side <= 0) {
			throw new ArithmeticException("Side must be greater than 0");
		} else {
			super.width = side;
			super.length = side;
		}
	}
	
	void setWidth(double side) {
		if(side <= 0) {
			throw new ArithmeticException("Side must be greater than 0");
		} else {
			setSide(side);
		}
	}
	
	void setLength(double side) {
		if(side <= 0) {
			throw new ArithmeticException("Side must be greater than 0");
		} else {
			setSide(side);
		}
	}
	
	public String toString() {
		return "Square[Shape[color="+super.color+",filled="+super.filled+"],width="+getWidth()+",length="+getLength()+"]";
	}
}
