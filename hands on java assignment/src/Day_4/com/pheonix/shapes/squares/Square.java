package Day_4.com.pheonix.shapes.squares;

import Day_4.com.pheonix.shapes.Shape;

public class Square extends Shape {

	private int side;

	public Square() {
		System.out.println("Square default constructor");
	}

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void calculateArea() {
		int area = side * side;
		System.out.println("Area of square:" + area);
	}

	@Override
	public void calculatePerimeter() {
		int perimeter = 4 * side;
		System.out.println("Perimeter of square:" + perimeter);

	}

}
