package Inheritance;

public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(String color, double length, double height) {
        super(color);
        this.length=length;
        this.height=height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length=length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    @Override
    public double area() {
        return length*height;
    }

    @Override
    public double perimeter() {
        return 2*(length+height);
    }

	@Override
	public void display() {
		System.out.println("Rectangle details:");
		super.display();
	}
    
    
}
