package oop_Principles_2_Garage;

public abstract class Motorvehicle extends Vehicle {

	private String fuelType;

	public Motorvehicle(int numWheels, int numPeopleCapacity, String vName, String fuelType) {
		super(numWheels, numPeopleCapacity, vName);
		this.fuelType = fuelType;
	}

	public void manufactured() {
		System.out.println("I'm factory made!");
	}

}
