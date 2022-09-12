package ExamAssignment3Sept2022;
//5.WAJP2 subtract two matrices.
public class Q5 {

	public static void main(String[] args) {
		 int rows, cols;  
		  
	        //Initialize matrix a  
	          int a[][] = {  
	                          {4, 5, 3},  
	                          {3, 4, 1},  
	                          {1, 2, 3}  
	                       };  
	  
	          //Initialize matrix b  
	          int b[][] = {  
	                          {2, 0, 6},  
	                         {2, 3, 1},  
	                         {1, 1, 1}  
	                     };  
	  
	          //Calculates number of rows and columns present in given matrix  
	          rows = a.length;  
	        cols = a[0].length;  
	  
	          //Array diff will hold the result  
	        int diff[][] = new int[rows][cols];  
	  
	        //Performs subtraction of matrices a and b. Store the result in matrix diff  
	        for(int i = 0; i < rows; i++){  
	            for(int j = 0; j < cols; j++){  
	                diff[i][j] = a[i][j] - b[i][j];  
	                System.out.print(diff[i][j]+" ");
	            }  
	            System.out.println(" ");
	        }  
	       
	}

}
