package Day_4.com.pheonix.shapes.main;

//Author:Rohit khatwani
//Date:14-06-2021
//version:1.0
//copyRight:Sterlite Technologies

import Day_4.com.pheonix.shapes.Shape;
import Day_4.com.pheonix.shapes.circles.Circle;
import Day_4.com.pheonix.shapes.rectangles.Rectangle;
import Day_4.com.pheonix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String args[]) {

		System.out.println("Problem statement C:\n");
		Shape shapeC = new Circle(6);
		Circle circle = (Circle) shapeC;
		circle.calculateArea();
		circle.calculatePerimeter();

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement D:\n");
		Shape shapeR = new Rectangle(5, 6);
		Rectangle rec = (Rectangle) shapeR;
		rec.calculateArea();
		rec.calculatePerimeter();

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement E:\n");
		Shape shapeS = new Square(5);
		Square square = (Square) shapeS;
		square.calculateArea();
		square.calculatePerimeter();

	}
}
