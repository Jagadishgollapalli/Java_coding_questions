package practice;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 756948;
		int count = 0;
		while (num != 0) {
			int digit = num % 10;
			count += digit;
			num = num / 10;
		}
		System.out.println("count " + count);
	}
}
