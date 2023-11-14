package Inheritance;

public class Shape {
	private String color;
	
	public Shape(String color) {
		this.color=color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public double area()
	{
		return 0.0;
	}
	
	public double perimeter()
	{
		return 0.0;
	}
	public void display() {
		System.out.println("Color:"+getColor());
		System.out.printf("Area:%.2f\n",area());
		System.out.printf("Perimeter:%.0f\n",perimeter());
		System.out.println("----------------------------------------");
	}


	
	
	
}
