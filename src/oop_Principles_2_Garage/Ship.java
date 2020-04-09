package oop_Principles_2_Garage;

public class Ship extends Vehicle implements Sailable {

	public Ship(int numOfWheels, int peopleCapacity, String vName) {
		super(numOfWheels, peopleCapacity, vName);
	}

	@Override
	public void canSail() {
		System.out.println("I can sail!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
	}

}
