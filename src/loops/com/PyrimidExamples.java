package loops.com;

public class PyrimidExamples {

	/*Print number
	1 2 3 4
	5 6 7
	8 9
	10*/
	
	public static void example1(){
		
		int k=1;
		for(int i=0;i<4;i++){
			for(int j=1;j<=4-i;j++){
				System.out.print(k + "\t" );
				k++;
			}
			System.out.println("");
		}
	}
	/*Print number
	 * 10
	 * 9 8 
	 * 7 6 5 
	 * 4 3 2 1
	 * 
	 */
	public static void example2(){
		int k=10;
		for(int i=1;i<5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k + "\t" );
				k--;
			}
			System.out.println("");
				
			
		}
	}
	/* Print number
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 */
	
	public static void example3(){
		
		for(int i=1;i<5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + "\t" );
			
			}
			System.out.println("");
				
			
		}
	}

	/*print number
	 * 3
	 * 6 9
	 * 12 15 18
	 */
	public static void example4(){
		int k=3;
		for(int i=1;i<5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k + "\t" );
				k=k+3;
			
			}
			System.out.println("");
				
			
		}
	}
	public static void main(String[] args) {
		example4();

	}

}
