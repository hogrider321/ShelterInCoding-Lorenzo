public class Main {
	public static void main(String[] args) {
		One one = new One();
		one.print_hello();
		one.print_bye();
		System.out.println(one.one());

		Two two = new Two();
		two.print_hello();
		two.print_bye();
		System.out.println(two.two());

		Three three = new Three();
		three.print_hello();
		three.print_bye();
		System.out.println(three.three());

		Circle circle1 = new Circle();
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());

		Circle circle2 = new Circle(15.0);
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());

		Square square1 = new Square();
		System.out.println(square1.area());
		System.out.println(square1.perimeter());

		Square square2 = new Square(20.0);
		System.out.println(square2.area());
		System.out.println(square2.perimeter());

		Rectangle rect = new Rectangle(10.0, 5.0);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
	}
}