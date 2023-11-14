package Inheritance2;

public class Technician extends Employee {
	private String specialization;

	public Technician(String name, int employee_ID, String specialization) {
		super(name, employee_ID);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public void display() {
		System.out.println("Technician details:");
		super.display();
		System.out.println("Specialization:"+getSpecialization());
		System.out.println("----------------------------------");
	}
	
	


	
	

}
