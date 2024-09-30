package practice;
import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
     	int num;
		int rev = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		num = scan.nextInt();
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		scan.close();
		System.out.println("Number after reversing is : ");
		System.out.println(rev);
	}
}
