package Que1;

class Circle {
	private double radius;
	private String color;

	public double getRadius() {
		return radius;
	}

	public Circle() {

		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {

		this.radius = radius;
	}
    
	public double getArea() {
		return 3.14*radius*radius;
	}

	

}

public class Ques1 {

	public static void main(String args[]) {
		
		Circle circle=new Circle(5.0);
		System.out.println("The radius of the circle is:"+circle.getRadius());

		System.out.println("The area of the circle is:"+circle.getArea());
	}

}
