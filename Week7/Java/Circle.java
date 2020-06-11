public class Circle implements Shape {
	private double radius;
	private final double pi = 3.14; // constant

	public Circle() {
		this.radius = 5.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	// pi * r^2
	public double area() {
		return pi * radius * radius;
	}

	// 2 * pi * r
	public double perimeter() {
		return 2 * pi * radius;
	}
}