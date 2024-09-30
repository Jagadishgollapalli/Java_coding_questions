package practice;

public class Swapping {
	static int num1 = 5;
	static int num2 = 6;
	static int num3 = 5;
	static int num4 = 6;
	static int swap;
	
	public static void main(String args[]) {
		/*One way of doing this using third variable*/
		swap = num2; 
		num2 = num1; 
		num1 = swap; 
		System.out.println("num1 " + num1 + " " + "num2 " + num2);
		
		/*without the use of third variable*/
		num3 = num3 + num4;
		num4 = num3 - num4;
		num3 = num3 - num4;
		
		/*method 3*/
		num4 = num3 + num4 - (num3=num4);
		
		System.out.println("num1 " + num1 + " " + "num2 " + num2);
	}
}
