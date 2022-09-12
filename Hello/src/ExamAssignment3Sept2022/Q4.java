package ExamAssignment3Sept2022;

import java.util.Arrays;
import java.util.Scanner;

//4.	WAJP2 create transpose of a matrix (transpose is converting rows to columns) and print it.
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the row and col size of an Array");
		  //creating a matrix  
		  int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
		      
		  //creating another matrix to store transpose of a matrix  
		  int transpose[][]=new int[3][3];  //3 rows and 3 columns  
		      
		  //Code to transpose a matrix  
		  for(int i=0;i<3;i++){    
		  for(int j=0;j<3;j++){    
		  transpose[i][j]=original[j][i];  
		  }    
		  }    
		    
		  System.out.println("Printing Matrix without transpose:");  
		  for(int i=0;i<3;i++){    
		  for(int j=0;j<3;j++){    
		  System.out.print(original[i][j]+" ");    
		  }    
		  System.out.println();//new line    
		  }    
		  System.out.println("Printing Matrix After Transpose:");  
		  for(int i=0;i<3;i++){    
		  for(int j=0;j<3;j++){    
		  System.out.print(transpose[i][j]+" ");    
		  }    
		  System.out.println();//new line    
		  }    
		  }}  