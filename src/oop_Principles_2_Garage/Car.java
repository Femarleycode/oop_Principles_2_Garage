package oop_Principles_2_Garage;

public class Car extends Motorvehicle {

	int bootSpace;
	int numDoors;

	public Car(int numWheels, int numPeopleCapacity, String vName, String fuelType, int bootSpace, int numDoors) {
		super(numWheels, numPeopleCapacity, vName, fuelType);
		this.bootSpace = bootSpace;
		this.numDoors = numDoors;
	}

	@Override
	public void move() {
		System.out.println("Vroom vrooooooooom");
	}

}
