package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ActuialReverse {
	public void reverse(int arr[],int len)
	{  int temp=0;
		for (int i=0;i<len/2;i++)
		{
			 temp = arr[i];
	        arr[i] = arr[len-i-1];
	        arr[len-i-1] = temp;
		}
		System.out.println("After Reverse"+Arrays.toString(arr));
	}

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter size of array : ");
     int len=s.nextInt();
     int arr []=new int [len];
     System.out.println("Enter array elements : ");
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i]=s.nextInt();
     }
     System.out.println("Without Reverse actual Array:"+Arrays.toString(arr));
     
     ActuialReverse r=new ActuialReverse();
     r.reverse(arr, len);
	}
}
