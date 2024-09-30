package practice;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 16461;
		int originalNum = num;
		int rev = 0;
		
		while(num!=0) {
			 rev = rev*10 + num%10;
			 num = num/10;
		}
		
		if(originalNum == rev) {
			System.out.println(originalNum + " It is a palindrome");
		}else {
			System.out.println(originalNum + " It is not a palindrome");
		}
	}
}
