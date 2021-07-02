package geometry;

public abstract class Shape {
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape() {	
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
}
