package Day_4.com.pheonix.shapes.rectangles;

import Day_4.com.pheonix.shapes.Shape;

public class Rectangle extends Shape {

	private int lenght;
	private int breadth;

	public Rectangle() {
		System.out.println("Rectangle default constructor");
	}

	public Rectangle(int length, int breadth) {
		this.lenght = length;
		this.breadth = breadth;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		int area = lenght * breadth;
		System.out.println("Area of Rectangle:" + area);
	}

	@Override
	public void calculatePerimeter() {
		int perimeter = 2 * (lenght + breadth);
		System.out.println("Perimeter of Rectangle:" + perimeter);
	}

}
