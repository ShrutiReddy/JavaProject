package loops.com;

public class SwapNumbers {

	//Swapping numbers without using 3rd variable
	
	public static void swapWithVariable(int a, int b){
		int c;
		
        c=a+b;
        a=c-a;
        b=c-b;
        
        System.out.println("the value of a is " +a + " The value of b is "+ b);
		
	}
	
	//Swap without variables
	public static void swapWithoutVariable(int a, int b){
		a=a+b;  //100
		b=a-b;//30
		a=a-b;//70
		System.out.println("the value of a is " +a + " The value of b is "+ b);
		
	}
	public static void main(String[] args) {
		int a =30;
		int b=70;
		swapWithVariable(a,b);
		swapWithoutVariable(a,b);

	}

}
