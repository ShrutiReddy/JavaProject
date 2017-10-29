package arrays.com;

public class MergeArray {
	
	//Merge two given array's
	
	public static int[] merge(int[] a, int [] b)
	{
		int [] c= new int[a.length + b.length];
		int i;
		
		for( i=0;i<a.length;i++) 
			
			c[i]=a[i];
			
			for(int j=0;j<b.length;j++) 
				c[i++]=b[j];
				return c;
			
		
		
		
		
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int c[]= (merge(a,b));
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}

}
