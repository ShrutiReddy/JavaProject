package strings.com;

import java.util.Scanner;

public class CountNumberofWordsInString {

	//Count the number of words in a string
	
	public static void count(){
		System.out.println("Please enter a String");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		int count =1;
 		for(int i=0;i<s.length();i++){
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("The number of words in this String is = " + count);
		
	}
	
	//Another way to split words in a string
	
	public static void count2(){
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String [] word = s.trim().split(" ");
		System.out.println("The number of words in the above given String are: "+ word.length);
	}
	public static void main(String[] args) {
		
		//count();
		count2();

	}

}
