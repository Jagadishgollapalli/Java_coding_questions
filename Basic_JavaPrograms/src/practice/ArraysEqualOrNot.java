package practice;

public class ArraysEqualOrNot {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 3, 4, 5, 6 };

		if (arr1.length != arr2.length) {
			System.out.println("not equal");
		} else {
			boolean y = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					y = false;
					break;
				}
			}
			if (y) {
				System.out.println("equal");
			} else {
				System.out.println("not equal");
			}
		}
	}
}
