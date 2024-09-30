package practice;

public class CountWordsInAString {
	public static void main(String[] args) {
		String str1 = "I am alone and depressed because no wonder is happening in my life, god should fix it!!";

		str1 = str1.replaceAll("\\s", " ");

		int count = 0;

		// Add 1 to the count to account for the first word if the string is not empty
		if (str1.length() > 0 && str1.charAt(0) != ' ') {
			count++;
		}

		for (int i = 0; i <= str1.length() - 1; i++) {
			if ((str1.charAt(i) == ' ') && (str1.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Number of words are " + count);
	}
}
