public class Square implements Shape {
	private double side;

	public Square() {
		this.side = 10.0;
	}

	public Square(double side) {
		this.side = side;
	}

	public double area() {
		return side * side;
	}

	public double perimeter() {
		return side * 4;
	}
}