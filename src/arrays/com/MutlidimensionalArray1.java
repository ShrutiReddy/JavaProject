package arrays.com;

public class MutlidimensionalArray1 {
	
	public static void minNumber(int a[][]){
		int min=a[0][0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]<min){
					min=a[i][j];
				}
			}
			
		}
		System.out.println(min);
		
	}
	
	
	public static void maxNumber(int a[][]){
		int max=a[0][0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]>max){
					max=a[i][j];
				}
			}
			
		}
		System.out.println(max);
		
	}
	
	//find the maxnumber in the min column
	public static void maxminColumn(int a[][]){
		int min =a[0][0];
		int  minColumn=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]<min){
					min=a[i][j];
					minColumn=j;
				}
			}
				
		}
		int max=a[0][minColumn];
		int k=0;
		
		while(k<2){
			if(a[k][minColumn]>max){
				max=a[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int a[] []= {{9,2,3},{4,5,11}};
		
		/*for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.println(a[i][j]);
			}
		}*/
		
		maxNumber(a);
		maxminColumn(a);

	}

}
