package loops.com;

public class Fibonaci {

	/**
	 * a series of numbers in which each number ( Fibonacci number )
	 *  is the sum of the two preceding numbers. 
	 * The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	 */
	
	public static void fibonaci(){
		int a =0;
		int b =1;
		for(int i=0;i<=10;i++){
			System.out.println(a);
			a=a+b;
			b=a-b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
