import java.util.*; // package that java has that allows us to use Math (see documentation for more uses)
import java.time.*;

public class Class3 {
	public static void main(String[] args) {
		// String str = "This is a string";
		// System.out.println(str.substring(0,5));
		// System.out.println(str.length());

		// String anotherStr = " Another string";
		// str += anotherStr;
		// System.out.println(str);

		// int a = 5;
		// int b = 10;
		// int sum = a + b;

		// // modulus
		// int remainder = b % a;
		// System.out.println(remainder);
		// // 11/5 = 2 R 1

		// System.out.println(Math.max(5, 10)); // takes both number and returns the larger number (math is its own library?)
		// System.out.println("Max: " + Math.max(a, b));
		// System.out.println("Min : " + Math.min(a, b));
		// System.out.println("Square root: " + Math.sqrt(11)); // gives square root. always as a double
		// System.out.println("Power: " + Math.pow(a, b));
		// System.out.println("Absolute value: " + Math.abs(-4.7)); // absolute value

		// double randNum = Math.random() * 6; // random number (check java math documentation if don't know)
		// System.out.println((int) randNum); // random integer

		Random rand = new Random(); // new Object, rand, that defines everything in the random class
		int randomInteger1 = rand.nextInt(6) + 1; // 1-5 + 1
		// 1 2 3 4 5 6
		System.out.println(randomInteger1);

		double randomDouble = rand.nextDouble();
		System.out.println(randomDouble);

		// Class3 class = new Class3(); // how to define objects

		boolean isTrue = true;
		boolean isFalse = false; // false
		// isFalse = !isFalse // true

		// && - and
		// || - or
		// so true and true - true
		// true and false - false
		// false and true - false
		// false and false - false
		System.out.println(isFalse && isTrue);
		System.out.println(isFalse || isTrue);

		// > - greater than
		// < - less than
		// >= - greater than equal
		// <= - less than equal
		// != - does not equal 
		// == - equals to

		int x = 10;
		int y = 9;

		System.out.println(x >= y); // returns boolean

		// if (x > y) { // if condition is true, execute code
		// 	System.out.println("x is greater than y");
		// } else if (x == y) { // if first condition is false but second is true, execute
		// 	System.out.println("x equals y");
		// } else { // if both previous conditions are false, execute
		// 	System.out.println("x is less than y)");
		// }

		// try getting current date
		int time = 15;
		if (time < 12) {
			System.out.println("Good Morning.");
		} else if (time >= 12 && time <= 17) {
			System.out.println("Good afternoon.");
		} else {
			System.out.println("Good evening.");
		}

		int num = 5;
		if (num % 2 == 0) {
			System.out.println("My number is even.");
		} else {
			System.out.println("My number is odd.");
		}


	}
}