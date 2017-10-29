package loops.com;

public class Factorial {

	//Factorial in recursive 
	/*The factorial function (symbol: !) means to multiply a series of descending natural numbers. Examples:

	    4! = 4 × 3 × 2 × 1 = 24
	    7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
	    1! = 1*/

	
	public static int factorialRecursive(int n){
		if(n==1)
			return 1;
		else
			return n*(factorialRecursive(n-1));
		
		
	}
	
	public static int factorial(int n){
		int result=1;
		
		while(n>=1){
			result =result*n;
			n--;
		}
		return result;
	}
	public static void main(String[] args) {
		int number =3;
		System.out.println("Factorial of " + number +" = "+factorialRecursive(number));
		System.out.println("Factorial of " + number +" = "+factorial(number));

	}

}
