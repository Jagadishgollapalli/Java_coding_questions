package practice;

public class ReverseAString {
public static void main(String[] args) {
	
	/*Method 1*/
	/**String str = "Jagadish";
    StringBuilder strbuild = new StringBuilder();
	strbuild.append(str);
	System.out.println(strbuild.reverse());*/
	
	/*Method 2*/
	String str = "Hello World";
	for(int i=str.length() -1; i>=0;i--) {
		System.out.print(str.charAt(i));
	}
}
}
