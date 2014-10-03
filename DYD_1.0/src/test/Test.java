package test;

import objects.Car;

public class Test {
	public static void main(String[] args) {

		Car car = new Car(5, "REG1", 99, "Russian Army Tank");

		System.out.println(car.getNumberOfSeats());

		System.out.println(car.getNumberOfWheels());

		System.out.println(car.getVehicleType());

		System.out.println(car.getRegistrationPlate());
		
		System.out.println(car.toString());

		car.setRegistrationPlate("REG2");

		System.out.println(car.toString());
	}
}
