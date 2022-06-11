package oopsConcepts;

public class SUVCar extends Car {
	@Override
	void cc() {
		
		int eC = 45;
		int avg = 5;
		int cc = eC * avg;
		System.out.println("SUV car CC is "+cc);
	}

	@Override
	void typeOfCar() {
		
		System.out.println("Type of car is SUV");
	}

}
