public class Class8 {
	public static void main(String[] args) {
		String[] words = {"a", "bb", "b", "ccc"};
		// System.out.println(wordsCount(words, 1));
		// System.out.println(repeatSeparator("Word", "X", 2));
		// System.out.println(sumDigits(126));
		// System.out.println(isPalindrome("racecar"));
		// System.out.println(reverseString("lorenzo"));
		String reverse = reverseString("Lorenzo");
		System.out.println(isPalindrome("Cat" + reverse));
	}

	// Given an array of strings, return the ocunt of the number of strings with the given length

	// wordsCount(["a", "bb", "b", "ccc"], 1) -> 2
	// wordsCount(["a", "bb", "b", "ccc"], 3) -> 1
	// wordsCount(["a", "bb", "b", "ccc"], 4) -> 0

	public static int wordsCount(String[] words, int len) {
		int numWords = 0;
		// loop through words array
		for (String word: words) {
			// find all words with given length
			if (word.length() == len) {
				numWords += 1;
				// numWords = numWords + 1;
			}
		}
		return numWords;
	}

	// Given 2 strings, word, seperator return the string and separator with
	// a count occurences of this word

	// repeatSeparator("Word", "X", 3) -> "WordXWordXWord")
	// repeatSeparator("This", "And, 2) -> "ThisAndThis")
	// repeatSeparator("This", "And", 1) -> "This")

	public static String repeatSeparator(String word, String separator, int count) {
		String result = "";
		result += word;

		count -= 1;

		for (int i = 0; i < count; i++) {
			result += separator;
			result += word;
		}
		return result;
	}

	// Given a non-negative integer, return the sum of all digits in the  integer
	// 126 -> 9 = 6 + 2 + 1
	// 49 -> 13 = 4 + 9

	// 343 % 10 = 3
	// 343 / 10 = 34

	public static int sumDigits(int n) {
		// base case - when you want program to terminate
		if (n == 0) {
			return 0;
		}
		return ((n % 10) + sumDigits(n / 10));

	}

	// 343 
	// 3 + sumDigits(34)
	// 		4 + sumDigits(3)
	//			3 + sumDigits(0)
	//				0


	// checking if a word is a palindrome (ex. radar)
	// is first letter equivalent to last letter, 2nd to 2nd to last, etc.

	public static boolean isPalindrome(String str) { // boolean functions usually start with is
		int startIndex = 0;
		int endIndex = str.length() - 1;

		while (startIndex < endIndex) {
			if (str.charAt(startIndex) != str.charAt(endIndex)) { // if we find that first letter doesnt equals last letter
				return false;
			}
			startIndex += 1;
			endIndex -= 1;
		}
		return true;
	}

	// take in a string and return the reverse of the string
	// reverseString("test") -> "tset"
	// reverseString("hello") -> "olleh"
	// reverseString("level") -> "level"

	public static String reverseString(String input) {
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			// hello: o l l e h
			reverse += input.charAt(i);
		}
		return reverse;
	}

}