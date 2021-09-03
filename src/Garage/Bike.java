package Garage;

public class Bike extends Vehicle {
	int wheels;
	int numberofSeats;
	static int registrationCost = 75;
	static int insuranceCost = 1500;

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public static int getRegistrationCost() {
		return registrationCost;
	}

	public static void setRegistrationCost(int registrationCost) {
		Bike.registrationCost = registrationCost;
	}

	public static int getInsuranceCost() {
		return insuranceCost;
	}

	public static void setInsuranceCost(int insuranceCost) {
		Bike.insuranceCost = insuranceCost;
	}

	public Bike(String licensePlate, boolean insured, int uID, String vehicleType) {
		super(licensePlate, insured, uID, vehicleType);
		this.licensePlate = licensePlate;
		Price = (int) calcBill();
		this.insured = insured;
		this.uID = uID;
		this.vehicleType = vehicleType;
	}

	@Override
	public float calcBill() {
		return (35 * wheels) + registrationCost + insuranceCost;
	}

}
