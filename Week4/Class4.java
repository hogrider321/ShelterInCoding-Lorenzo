import java.util.Random;
import java.util.Scanner; // class used for inputs
import java.util.Arrays; // arrays class

// import java.util.*; // imports all classes under java.util package 

public class Class4 {
	public static void main(String[] args) {
		// Random rand = new Random();
		// int randInt = rand.nextInt(6) + 1; // 1 2 3 4 5 6
		// System.out.println("The dice rolled a " + randInt);

		// Scanner scan = new Scanner(System.in); // allows for user input. System.in is opposite of System.out
		// // System.out.print("Enter your name: "); // not println so on same line
		// // String name = scan.nextLine(); // puts what returned in variable name (name)
		// // System.out.println(name); 

		// System.out.print("Enter your age: ");
		// // int age = scan.nextInt();
		// // System.out.println("My age is " + age);

		// if (scan.hasNextInt()) {
		// 	int age = scan.nextInt();
		// 	System.out.println("My age is " + age);
		// } else {
		// 	System.out.println("Your input was not a number");
		// }

		// System.out.print("Enter a number: ");
		// int myNumber = scan.nextInt();
		// if (myNumber % 2 == 0) {
		// 	System.out.println(myNumber + " is even");
		// } else {
		// 	System.out.println(myNumber + " is odd");
		// }

		// for loops - you know exactly the number of times to run a loop
		// for (statment 1; statement 2; statement 3) {
		// 	(code) 
		// }

		// // variable disappears after foreloop
		// for (int i = 0; i <= 5; i+= 2) { // keeps on incrementing i until it equals five. i++ will increment by 1
		// 	System.out.println("The value of i is: " + 1);
		// }

		// for (int j = 10; j>= 1; j--) {
		// 	System.out.println("The value of j is: " + 1);
		// }

		// Scanner scan = new Scanner(System.in);

		// System.out.print("Enter a decimal: ");
		// double decimal = scan.nextDouble();
		// System.out.println(decimal);

		// System.out.print("Enter a minimum: ");
		// int min = scan.nextInt();

		// System.out.print("Enter a maximim: ");
		// int max = scan.nextInt();

		// // creates list of numbers between min and max on same line
		// for (int i = min; i < max; i++) {
		// 	System.out.print(i + " ");
		// }

		// while loops
		// while (condition) {
		// 	(code)
		// }
		// int count = 1;
		// while (count < 5) {
		// 	System.out.println(count);
		// 	count++;
		// }

		// // infinite loop unless break it
		// while(true) {
		// 	System.out.println("Hello");
		// }

		// arrays - list of items
		int arr[] = {2, 9, 3, 49};
		// System.out.println(arr); // gives out hash code (variable assigned to array by java)
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int arrLength = arr.length;

		for (int i = 0; i < arrLength; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]); // access different elements of i. first index is 0 (=2)
		}
		System.out.println(arr[2]); // prints 3rd part of array
		// i = 0 arr[] = 2
		// Element at index 0: 2 

		String[] cars = {"Volvo", "BMW", "Ford"}; // String[] - another way to create an array
		// System.out.println(cars[0]);

		cars[0] = "Mercedes";
		System.out.println(Arrays.toString(cars));

		cars[2] = "Acura";
		System.out.println(Arrays.toString(cars));

		for (int i = 0; i < cars.length; i++) { // prints each part of array individually
			System.out.println(cars[i]);
		}


		// String myTempString = "This is a string";
		// System.out.println(myTempString.length());
	}
}