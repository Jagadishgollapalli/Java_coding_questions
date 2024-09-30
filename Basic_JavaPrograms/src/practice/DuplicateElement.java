package practice;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,7,8,9,5,5};
		
		boolean flag = false;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j< arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("found duplicate" + arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("not found");
		}
	}

}
