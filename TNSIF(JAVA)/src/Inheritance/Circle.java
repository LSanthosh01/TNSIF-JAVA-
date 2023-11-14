package Inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); 
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

	@Override
	public void display() {
		System.out.println("Circle details: ");
		super.display();
	}
    
    
}
