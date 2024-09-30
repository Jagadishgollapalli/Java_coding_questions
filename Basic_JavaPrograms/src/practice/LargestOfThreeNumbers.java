package practice;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int nums[] = { 10, 20, 19, 77 };
		int greatest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > greatest) {
				greatest = nums[i];
			}
		}
		System.out.println("greatest " + greatest);
	}
}
