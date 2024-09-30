package practice;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int arr[] = { 1, 2, 4, 5 }; */
		int arr2[] = { 11, 12, 14, 15 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i <= arr2.length - 1; i++) {
			sum1 = sum1 + arr2[i];
			sum2 = sum1 / arr2.length;
		}
		System.out.println(sum2);
	}
}
