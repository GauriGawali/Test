package ExamAssignment3Sept2022;

import java.util.Arrays;
import java.util.Scanner;

//1.WAJP2 find sum of each row and column of a matrix.
public class Q1 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the row and col size of an Array");
		  int row=sc.nextInt();
		  int col=sc.nextInt();
		  
		  int a[][]=new int[row][col];
		  for(int i=0;i<row;i++)
		  {
			  for(int j=0;j<col;j++) {
				  a[i][j]=sc.nextInt();
			  }
			  
		  }
		  int sumr,sumc;
		//  System.out.println(Arrays.toString(a[row][col]));
		  for(int i = 0; i < row; i++){    
	            sumr = 0;    
	            for(int j = 0; j < col; j++){    
	              sumr = sumr + a[i][j];    
	            }    
	            System.out.println("Sum of " + (i+1) +" row: " + sumr);    
	        }    
	            
	        //Calculates sum of each column of given matrix    
	        for(int i = 0; i < col; i++){    
	            sumc = 0;    
	            for(int j = 0; j < row; j++){    
	              sumc = sumc + a[j][i];    
	            }    
	            System.out.println("Sum of " + (i+1) +" column: " + sumc);    
	        }    
	    }    
	}


