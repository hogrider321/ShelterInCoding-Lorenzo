public class Three extends Two {
	public void print_hello() {
		System.out.println("Three");
	}

	public void print_bye() {
		super.print_bye();
		System.out.println("Three");
	}

	public int three() {
		return 3;
	}
}