package interviewQ;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
	      int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
	      System.out.println("Array1 : "+Arrays.toString(array1));
	       System.out.println("Array2 : "+Arrays.toString(array2));
	 int array3 []=new int [array1.length+array2.length];
	 
	 for(int i=0;i<array1.length;i++) {
		
			 array3[i]=array1[i];
		 }
	 int a=array1.length;
	    for(int i=0;i<array2.length;i++) {
		 array3[a+i]=array2[i];
	 }
	 
	 System.out.println(Arrays.toString(array3));
	       Arrays.sort(array3);
	       System.out.println(Arrays.toString(array3));
	
	
	       for (int i = 0; i < array3.length; i++)
	        {
	    	   int c=0;
	          // for (int j = i+1; j < array3.length; j++)
	        	   for (int j = 0; j < array3.length; j++)

	            {
	                if(array3[i] == (array3[j]))
	                { c++;
	                	//continue;
	                } 
	                
	                
	            }
	        
	           if(c==1) {
	        	   System.out.println(array3[i]);
	        	  }
	           
	   		}

	   	}
	
	
	}


