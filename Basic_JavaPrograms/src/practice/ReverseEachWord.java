package practice;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am alone and depressed";
		
		String words[] = str1.split("\\s"); 
//		System.out.println(Arrays.toString(words));
		String reverseString="";
		
		for(String word: words) {
			String reverseWord="";
			for(int j=word.length()-1; j>=0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}

}
