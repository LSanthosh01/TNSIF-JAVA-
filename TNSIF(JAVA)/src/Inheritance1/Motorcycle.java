package Inheritance1;

public class Motorcycle extends Vehicle {
	private int top_speed;

	public Motorcycle(String make, String model, int year, int top_speed) {
		super(make, model, year);
		this.top_speed = top_speed;
	}

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}

	@Override
	public void display_info() {
		System.out.println("Motorcycle details:");
		super.display_info();
		System.out.println("Top speed:"+getTop_speed());
		System.out.println("---------------------------");
	}
	
	
	

}
