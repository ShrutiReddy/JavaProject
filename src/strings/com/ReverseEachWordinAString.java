package strings.com;

public class ReverseEachWordinAString {

	//How To Reverse Each Word Of A String In Java?
	public static void reverseString1(String s){
		String [] words = s.split(" ");
		String reverseString="";
		
		//loop1
		for(int i=0;i<words.length;i++){
			String word = words[i];
			String reverseWord ="";
			
			for(int j=word.length()-1;j>=0;j--){
				reverseWord=reverseWord + word.charAt(j);
			}
			reverseString=reverseString +reverseWord+" ";
			
		}
		
		System.out.println(s);
        
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		String s = "hello Java";
		reverseString1(s);

	}

}
