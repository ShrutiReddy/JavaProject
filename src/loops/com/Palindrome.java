package loops.com;

public class Palindrome {

	/**
	 *  palindrome number is a number which is equal to reverse of itself. For example 121 is a palindrome 
	 *  because reverse of 121 is 121, while 123 is not a palindrome 
	 */
	
	public static void palindrome(int n){
		int sum =0;
		int temp,r;
		temp=n;
		
		while(temp>0){
			r = temp%10;
			temp=temp/10;
			sum=sum*10+r;
			
		}
		if(n==sum){
			System.out.println("Its a palindrome");
		}else{
			System.out.println("Not an Palindrome number");
		}
		
		
	}
	public static void main(String[] args) {
		palindrome(122);

	}

}
