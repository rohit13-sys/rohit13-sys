package Day_4.com.pheonix.shapes.circles;

import Day_4.com.pheonix.shapes.Shape;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		System.out.println("Circle default constructor");
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		double area = MATH_PI * radius * radius;
		System.out.println("Area of the circle:" + area);
	}

	@Override
	public void calculatePerimeter() {
		double perimeter = 2 * MATH_PI * radius;
		System.out.println("Perimeter of the circle:" + perimeter);
	}

}
