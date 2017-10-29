package strings.com;

public class RemoveWhiteSpaces {
	
	public static void whiteSpaces(String s){
		String noWhiteSpace = s.replaceAll("\\s", "");
		System.out.println(noWhiteSpace);
		
	}
	
	public static void removeSpaces(String s)
	{
		char [] arryStr = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0;i<arryStr.length;i++){
			if((arryStr[i]!=' ') && (arryStr[i]!='\t')){
				sb.append(arryStr[i]);
			}
		}
		
		System.out.println(sb);
		
	}
	public static void main(String[] args) {
		String s = "I am a very nice person";
		whiteSpaces(s);
		removeSpaces(s);
		

	}

}
