package Garage;

abstract public class Vehicle {
	 String licensePlate;
	 int Price;
	 boolean insured;
	 int uID;
	 String vehicleType;


	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Vehicle(String licensePlate, boolean insured, int uID, String vehicleType) {
		super();
		this.licensePlate = licensePlate;
		Price = (int) calcBill();
		this.insured = insured;
		this.uID = uID;
		this.vehicleType = vehicleType;
	}
	public abstract float calcBill();
	
	

}
