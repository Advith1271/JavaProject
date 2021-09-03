package Garage;

public class Car extends Vehicle {
int wheels;
int numberofSeats;
static int registrationCost = 100;
static int insuranceCost = 2000;

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
	public Car(String licensePlate, boolean insured, int uID, String vehicleType) {
		super(licensePlate,insured,uID,vehicleType);
		this.licensePlate = licensePlate;
		Price = (int) calcBill();
		this.insured = insured;
		this.uID = uID;
		this.vehicleType = vehicleType;
	}
	
	@Override
public float calcBill() {
		return (50*getWheels()) + registrationCost + insuranceCost;
		
	}

}
