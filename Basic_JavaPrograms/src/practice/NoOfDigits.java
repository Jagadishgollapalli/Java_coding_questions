package practice;

public class NoOfDigits {
	public static void main(String[] args) {
		long num = 1234567890234l;
		int count = 0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
	}
}
