package strings.com;

public class CountGivenCharinString {

	//Count the total number of a given character in a string
	public static void count(String s){
		char c ='a';
		int size = s.length()-s.replace("a","").length();
		System.out.println("The number of occurances of 'a' in "+ s + " is "+ size);
		
	}
	
	public static void reverseString(String s){
		
		String r="";
		for(int i=s.length()-1;i>=0;i--){
			r=r+s.charAt(i);
		}
		System.out.println(r);
		
		if(s.equalsIgnoreCase(r)){
			System.out.println("Its a palindrome");
		}else{
			System.out.println("Its not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		String s = "Java is a java";
		//count(s);
		reverseString(s);
		

	}

}
