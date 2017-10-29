package strings.com;

public class CovertStringtoIntAndintToString {

	
	

	
	
	public static void main(String[] args) {
		//To Convert String To Integer Using Integer.parseInt() method :		
		String s ="2015";
		int i= Integer.parseInt(s);
		//int j=i;
		
		
		System.out.println(i);
		
		//To Convert String To Integer Using Integer.valueOf() method :
		String b="2016";
		int j= Integer.valueOf(b);
		System.out.println(j);
		
		//To Convert Integer To String Using Integer.toString() Method
		int a = 2017;
		String c = Integer.toString(a);
		System.out.println(c);
		
		
		//To Convert Integer To String Using String.valueOf() method :
		
		int x = 2018;
		String y = String.valueOf(x);
		System.out.println(y);

	}

}
