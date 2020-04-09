package oop_Principles_2_Garage;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		garage g = new Garage();
//		g.addVehicle(new Car())
//		
//		if you want to remove all of a type in the garage
//		g.removeVehicleByType(Car.class);

		Car iCar1 = new Car(4, 5, "Red Merc", "Petrol", 100, 4);
		Car iCar2 = new Car(4, 5, "Blue Merc", "Diesel", 100, 4);
//		Ship iShip = new Ship();
//		Motorcycle iMotorcycle = new Motorcycle();

		List<Vehicle> garage = new ArrayList<Vehicle>();

		garage.add(iCar1);
		garage.add(iCar2);
//		garage.add(iShip);
//		garage.add(iMotorcycle);

		for (Vehicle a : garage) {
			a.move();
			((Motorvehicle) a).move();
			if (a instanceof Car) {
				((Car) a).move();
			}
		}

	}

}
