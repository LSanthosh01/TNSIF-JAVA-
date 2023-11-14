package Inheritance2;

public class Manager extends Employee {
	private String department;

	public Manager(String name, int employee_ID, String department) {
		super(name, employee_ID);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void display() {
		System.out.println("Manager details:");
		super.display();
		System.out.println("Department:"+getDepartment());
		System.out.println("----------------------------------");
	}
	
	

}
