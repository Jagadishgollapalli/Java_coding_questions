package practice;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str1 = "@#$%^&gshfjkie567890ABCGDSHEO";
		String str2 = "Somebody give me a job please!!";
		/* For str1 with special characters */
		String s1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		/* For str2 with white spaces */
		String s2 = str2.replaceAll("\\s", "");
		System.out.println(s1);
		System.out.println(s2);
	}
}
