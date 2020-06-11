public class Student {
	public static void main(String[] args) { 
	// static: class-related method - class can only be accessed within the class
	// main: how java wants you to define your class
	// String[] args: tells code to take argument I put in terminal
		// {"these", "are", "arguments"}
		for (String element: args) {
			System.out.println(element);
		}
	}
}