package ExamAssignment3;

public class Q3 {

	public static void main(String[] args)
	{ 
	
		 int rowCount = 1;
		 
	        int rows =9;
	 
	        for (int i = rows; i >= 1; i--)
	        {
	             for (int j = 1; j <= i*2; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            for (int j = i; j <= rows; j++)          
	            {
	                System.out.print(j+" ");
	            }
      
	            for (int j = rows-1; j >= i; j--)
	            {               
	                System.out.print(j+" ");            
	            }
	             
	            System.out.println();
	 
	            rowCount++;
	        }
	
	

	
	
	//public static void main(String[] args) {
	//	MethodPattern f1 = new MethodPattern();
		
		/*f1.numericalPattern();
        System.out.println("\n-----------Second Program-----------------");
        System.out.println("\n");
		f1.characterPattern();

	}
*/
}
	}

