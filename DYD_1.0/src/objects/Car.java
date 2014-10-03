package objects;

public class Car {

	private int numberOfSeats;
	private String registrationPlate;
	private int numberOfWheels;
	private String vehicleType;
	
	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", registrationPlate="
				+ registrationPlate + ", numberOfWheels=" + numberOfWheels
				+ ", vehicleType=" + vehicleType + "]";
	}
	public Car(int numberOfSeats, String registrationPlate, int numberOfWheels,
			String vehicleType) {
		super();
		this.numberOfSeats = numberOfSeats;
		this.registrationPlate = registrationPlate;
		this.numberOfWheels = numberOfWheels;
		this.vehicleType = vehicleType;
	}
	public String getRegistrationPlate() {
		return registrationPlate;
	}
	public void setRegistrationPlate(String registrationPlate) {
		this.registrationPlate = registrationPlate;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	
	
}
