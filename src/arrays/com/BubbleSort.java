package arrays.com;

import java.util.Arrays;

public class BubbleSort {

	//Bubble sort array
	public static void sortArray(int a[]){
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				
				if(a[i]>a[j]){
					swap(a,i,j);
					/*
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					*/
				}
				
			}
		}
		for(int i=0;i<a.length;i++){
			//System.out.println(a[i]);
		}
	}
	
	/*
	 * a => array a
	 * i => index of a at i
	 * j =>
	 */
	public static void swap(int[] a, int i, int j){
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void swap(int a[]){
		int i,j;
	
		i=a[2];// i is 1
		j=a[3];
		a[2]=j;
		a[3]=i;
		
		 
	}
	public static void main(String[] args) {
		int a[]= {5,8,1,10,2,4,7,37,9};		
		System.out.println(Arrays.toString(a));
		sortArray(a);
		System.out.println(Arrays.toString(a));
		//sortArray(a);
		//swap( a);

		//a, 2,3
		swap(a,2,3);
		System.out.println(Arrays.toString(a));
		
		swap(a,7,0);
		System.out.println(Arrays.toString(a));
		
	
	}
}
