package loops.com;

public class PrimeNumber {

/*	A prime number is a whole number greater
    than 1, whose only two whole-number factors are 1 and itself. 
	The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.*/
	
	
	public static boolean primeNumber(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int num =7;
		System.out.println("Is "+ num +" a prime number "  + primeNumber(num));

	}

}
