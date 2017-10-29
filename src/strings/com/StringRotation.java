package strings.com;

public class StringRotation {

	//if s1 and s2 are two given strings, then write a java program to check whether s2 is a rotated version of s1?
	public static void rotation(String str1, String str2){
		
		if(str1!=str2){
			System.out.println("s2 is not rotated version of s1");
		}else{
			String str3= str1+str1;
			
			if(str3.contains(str2)){
				System.out.println("s2 is a rotated version of s1");
				
			}else{
				System.out.println("s2 is not rotated version of s1");
			}
		}
		
	}
	public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";
        
        String s2 = "StrutsHibernateJavaJ2ee";

		rotation(s1,s2);

	}

}
