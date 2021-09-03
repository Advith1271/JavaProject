package Garage;

import java.util.ArrayList;

public class Garage {

	public static ArrayList<Vehicle> vehicles = new ArrayList<>();
	public static void main(String[] args) {
		Car car1 = new Car("E2 14F", true, 0, "Car");
		addList(car1);
		listVehicles();
	}

	public Garage() {
	}

	public static void addList(Vehicle e) {
		vehicles.add(e);

	}

	public static void removeList(int uID) {
		Vehicle temp = null;
		for (Vehicle it : vehicles) {
			if (it.getuID() == uID) {
				temp = it;
				break;
			}

		}
		if (temp != null)
			vehicles.remove(temp);

	}

	public static void listVehicles() {
		for (Vehicle it : vehicles) {
			System.out.println(it.getuID() + " " + it.getVehicleType() + " " + it.getPrice());

		}
	}
	public static void clearList() {
		vehicles.clear();
	}
}
