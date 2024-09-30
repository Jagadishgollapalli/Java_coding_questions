package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		int y=0;
		
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				y = 1;
				break;
			}
		}
		if(y == 0) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}

}
