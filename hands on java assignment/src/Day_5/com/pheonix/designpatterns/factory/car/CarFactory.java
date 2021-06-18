package Day_5.com.pheonix.designpatterns.factory.car;

public class CarFactory {

	public static Car newCar(String carType) {
		if (carType.equals("sedan")) {
			return new SedanCar();
		}

		else if (carType.equals("couple")) {
			return new CoupleCar();
		}

		else if (carType.equals("sports")) {
			return new SportsCar();
		}

		else if (carType.equals("luxury")) {
			return new LuxuryCar();
		} else {
			return null;
		}
	}

}
