package ExamAssignment3Sept2022;
//3.WAJP2 find sum of lower triangular matrix.
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the row and col size of an Array");
		  int row=sc.nextInt();
		  int col=sc.nextInt();
		  
		  int a[][]=new int[row][col];
		  for(int i=0;i<row;i++)
		  {
			  
			  for(int j=0;j<a[i].length;j++) {
				  a[i][j]=sc.nextInt();
			  }
			  
		  }
		 int sumd=0;
		  
		  for(int i = 0; i < row; i++){    
	              
	            for(int j = 0; j < a[i].length; j++){  
	            	if(i>j)
	              sumd = sumd + a[i][j];    
	            }    
		  
	            System.out.println("Sum of " +" lower trangular: " + sumd);    
	      
		  }//System.out.println(" ");
	}

}
