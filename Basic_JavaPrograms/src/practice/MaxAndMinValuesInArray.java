package practice;

public class MaxAndMinValuesInArray {
	public static void main(String[] args) {
		int arr[] = { 3, 9, 5, 13, 29 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max " + max + " " + "Min " + min);
	}
}
