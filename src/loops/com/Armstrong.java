package loops.com;

public class Armstrong {

	/**
	 * Armstrong number is a number that is equal to the sum of cubes
	 *  of its digits for example 0, 1, 153, 370, 371, 407 etc
	 */
	
	public static void armstrong(int n){
		int sum=0;
		int r, temp;
		temp =n;
		while(temp>0){
			r=temp%10;
			temp=temp/10;
			sum=sum+ r*r*r;
		}
		
		if(n==sum){
			System.out.println("Number is an armstrong number");
		}else{
			System.out.println("Not an armstrong number");
		}
		
	}
	public static void main(String[] args) {
	armstrong(400);

	}

}
