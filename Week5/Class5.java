import java.util.Scanner;
import java.util.Arrays;

public class Class5 {
	public static void main(String[] args) {
		// review:
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter a minimum: ");
		// int min = scan.nextInt();
		// System.out.println("Enter a max: ");
		// int max = scan.nextInt();

		// for (variable; condition; increment/decrement) {
		// 			(code))
		// }

		// for (int i = 0; i < 5; i++) { // i starts at 0 and adds 1 until 5
		// 	System.out.println(i);
		// }

		// for (int i = min; i <= max; i += 2) {
		// 	System.out.println("Value of i: " + i);
		// }

		// while loop (remember to have increment/decrement)
		// int count = 0;
		// while (count < 10) {
		// 	System.out.println(count);
		// 	count += 1;
		// }

		// arrays
		int[] arr = {2, 5, 1, 10};
		// System.out.println(Arrays.toString(arr));
		// arr [0] = 50;
		// System.out.println(Arrays.toString(arr));

		// arr.length = 4
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.println(arr[i]);
		// }

		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// for each loop (easier way of above)
		// for (string car: cars) {
			// System.out.println(car);
		// }

		// new content:    :P
		
		// myArr[0] = 0
		// myArr[1] = 1
		// myArr[2] = 2
		// myArr[3] = 3
		// int[] myArr = new int[4]; // creates new empty array with 4 spaces in it
		// System.out.println(Arrays.toString(myArr));
		// for (int i = 0; i < myArr.length; i++) {
		// 	myArr[i] = i;
		// }
		// System.out.println(Arrays.toString(myArr));

		// myArr[0] = 1 + counter = 11
		// myArr[1] = 11 + counter = 21
		// int counter = 1;
		// for (int i = 0; i < myArr.length; i++) {
		// 	myArr[i] = counter;
		// 	counter += 10;
		// }
		// System.out.println(Arrays.toString(myArr));

		// find the biggest shoe size of your friends...
		double[] shoeSize = {8.5, 12, 9, 10.5, 13};
		int arrLength = shoeSize.length;
		double maxSize = 0.0; // because all values will be above zero
		for (int i = 0; i < arrLength; i++) {
			if (shoeSize[i] > maxSize) {
				maxSize = shoeSize[i];
			}
		}

		System.out.println(maxSize);

		// 1st iteration
		// shoeSize[0] = 8.5 
		// 8.5 > 0.0 YES - maxSize = 8.5

		// 2nd iteration
		// shoeSize[1]  = 12
		// 12 > 8.5 YES - maxSize = 12

		// 3rd iteration
		// shoeSize[2] = 10.5
		// 9 > 12 NO

		// 4th iteration
		// shoeSize[3] = 10.5
		// 10.5 > 12 NO

		// 5th iteration 
		// shoeSize[4] = 13
		// 13 > 12 YES - maxSize = 13
		
		double maxShoe = 0.0;
		for (double size: shoeSize) {
			if (size > maxShoe) {
				maxShoe = size;
			}
		}

		System.out.println(maxShoe);
	}
}