package loops.com;

public class PingPongSeries {

	
	/* Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5,
	 and "ping pong"
	 if number is divisible by both, else print the number.*/
	
	public static void pingPong(){
		for(int i=0;i<=100;i++){
			if((i%3==0)&&(i%5==0)){
				System.out.println("PingPong");
			}else if(i%5==0){
				System.out.println("Pong");
			}else if(i%3==0){
				System.out.println("Ping");
			}else{
				System.out.println(i);
			}
		}
	}
	 
	public static void main(String[] args) {
		pingPong();

	}

}
