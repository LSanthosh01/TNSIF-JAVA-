package Inheritance2;

public class Employee {
	private String name;
	private int employee_ID;
	public Employee(String name, int employee_ID) {
		this.name = name;
		this.employee_ID = employee_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	
	public void display()
	{
		System.out.println("Employee name:"+getName());
		System.out.println("Employee ID:"+getEmployee_ID());
	}
	
	

}
