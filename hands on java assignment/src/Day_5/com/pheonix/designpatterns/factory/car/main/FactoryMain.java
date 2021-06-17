package Day_5.com.pheonix.designpatterns.factory.car.main;

import java.util.Scanner;

import Day_5.com.pheonix.designpatterns.factory.car.Car;
import Day_5.com.pheonix.designpatterns.factory.car.CarFactory;

public class FactoryMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Car car=CarFactory.newcar(str);
		car.start();
		car.stop();
		car.run();
	}

}
