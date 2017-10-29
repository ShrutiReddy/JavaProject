package strings.com;

public class StringFunctions {

	
	public static void main(String[] args) {
		String s = "Hello Shruti";//creating string literal
		String sb = new String("hello");//creating oject of a String
		
		System.out.println(s.charAt(2));
		System.out.println(s.subSequence(0, 4));
		System.out.println(s.substring(5));
		System.out.println(s.concat(" how are u dooing?"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String arr[] = s.split(" ");
		System.out.println(arr[1]);
		System.out.println(s.replaceFirst("i", "y"));
		

	}

}
