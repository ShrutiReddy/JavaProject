package strings.com;

import java.util.Arrays;

public class Anagram {

	/**
	 * Two strings are called anagrams if they contain same set of characters 
	 * but in different order.  For example, “Dormitory – Dirty Room”, 
	 * “keep – peek”,  “School Master – The Classroom” are some anagrams.
	 */
	
	public static void anagramString(String s1, String s2){
		//Removing the white spaces in string
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		
		
		Boolean status = true;
		//comparing if they are equal
		if(str1.length()!= str2.length()){
			status= false;
		}else{
			char []s1arr = str1.toLowerCase().toCharArray();
			char []s2arr = str2.toLowerCase().toCharArray();
			
			//Sorting
			Arrays.sort(s1arr);
			Arrays.sort(s2arr);
			
			status = Arrays.equals(s1arr, s2arr);
			if(status){
				System.out.println(s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+s2+" are not anagrams");
	        }
	    
			}
		}
		
	
	public static void main(String[] args) {
		anagramString("Mother In Law", "Hitler Woman");

	}

}
