package Inheritance1;

public class Car extends Vehicle {
	private int num_doors;

	public Car(String make, String model, int year, int num_doors) {
		super(make, model, year);
		this.num_doors = num_doors;
	}

	public int getNum_doors() {
		return num_doors;
	}

	public void setNum_doors(int num_doors) {
		this.num_doors = num_doors;
	}

	@Override
	public void display_info() {
		System.out.println("Car details:");
		super.display_info();
		System.out.println("No.of doors:"+getNum_doors());
		System.out.println("---------------------------");
	}
}
