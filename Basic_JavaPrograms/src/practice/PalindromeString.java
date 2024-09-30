package practice;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "racecar";
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.equals(reverseStr)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a Palindrome String");
		}
	}
}
