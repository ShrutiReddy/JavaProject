package collections.com;

import java.util.HashMap;
import java.util.Set;

public class CountDupicateWordsinString {
	
	//Write a java program to find the duplicate words and their number of occurrences in a string?
	
	public static void countWords(String inputString) {
		//Splitting the words in an array
		String [] words = inputString.split(" ");
		
		//Creating a HasMap to store the words in key value pair
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//looping throught the hasmao
		for(String word: words) {
			//adding to hashmap
			if(wordCount.containsKey(word.toLowerCase())) {
				
				wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
				
			}else {
				//if it is not present put that word in to wordcount. count as 1.
				wordCount.put(word.toLowerCase(),1);
			}
		}
		
		//extracting all keys of wordCount
		Set<String> wordsInString = wordCount.keySet();
		//Iterating through all words in wordCount
		for(String word: wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word+" : "+wordCount.get(word));
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		String s ="java is java and very java is and good";
		countWords(s);

	}

}
