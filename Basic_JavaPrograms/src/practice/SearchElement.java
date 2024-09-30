package practice;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 4, 60, 32, 12 };
		int search_element = 20;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == search_element) {
				System.out.println("element is located at position " + i);
			}
		}
	}

}
