public class Two extends One {
	public void print_hello() {
		super.print_hello();
		System.out.println("World");
	}

	public int two() {
		return 2;
	}

	public String toString() {
		return "2";
	}
}