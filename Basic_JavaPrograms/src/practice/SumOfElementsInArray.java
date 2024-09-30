package practice;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 10, 20, 12, 43, 23, 5, 65, 40, 2 };
		int sum = 0;

		for (int i = 0; i <= nums.length-1; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);
	}

}
