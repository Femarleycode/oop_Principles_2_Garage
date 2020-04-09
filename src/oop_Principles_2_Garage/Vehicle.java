package oop_Principles_2_Garage;

public abstract class Vehicle {

	private int numOfWheels;
	private int peopleCapacity;
	private String vName;
	// private int topSpeed;

	public abstract void move();

	// constructor to create Vehicle instances with no arguments
	public Vehicle() {
		super();
	}

	// constructor for creating Vehicles instances with all arguments.
	public Vehicle(int numOfWheels, int peopleCapacity, String vName) {
		super();
		this.numOfWheels = numOfWheels;
		this.peopleCapacity = peopleCapacity;
		this.vName = vName;
	}

	// Wheels
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	// People Capacity
	public int peopleCapacity() {
		return peopleCapacity;
	}

	public void setPeopleCapacity(int peopleCapacity) {
		this.peopleCapacity = peopleCapacity;
	}

	// Name of vehicle
	public String vName() {
		return vName;
	}

	public void vName(String vName) {
		this.vName = vName;
	}

}
