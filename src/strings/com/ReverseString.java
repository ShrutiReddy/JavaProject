package strings.com;

public class ReverseString {

	public static void reverseStr(String s){
		
		String r ="";
		for(int i=s.length()-1;i>=0;i--){
			r=r+s.charAt(i);
		}
		System.out.println(r);
		
		if(s.equals(r)){
			System.out.println("Its a palindrome");
		}else{
			System.out.println("Its not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		String s = "java";
		reverseStr( s);

	}

}
