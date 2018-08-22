
package com.adt.login;
import java.util.Random;
import java.util.Arrays;

public class FisherYates {
	
	 static void randomize(int arr[], int n)
	 {
		 Random r = new Random();
		 for( int i=n-1 ; i>0 ; i--)
		 {
			 int j = r.nextInt(i);
			 int temp= arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;

		 }
		 System.out.println(Arrays.toString(arr));
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {91,22,35,64,85,96,70,84,92,10} ;       
		int n = arr.length;
		randomize(arr,n);
		

	}

}
