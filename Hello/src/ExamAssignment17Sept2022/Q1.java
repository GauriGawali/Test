package ExamAssignment17Sept2022;
/*
 1.	WAP to show the scenario in which IndexOutBound Exception
  (Both ArrayInexOutOfBound and StringIndexOutOfBound) exception 
  is generated and handle this exception.


 */
public class Q1 {

	public static void main(String[] args) {
		 String str = "My String";
	        try {
	            System.out.println(str.charAt(9));
	        } catch(StringIndexOutOfBoundsException e) {
	            System.out.println("String index out of bounds. String length: " + str.length());
	        }
	        
	        
	        String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
	      //Declaring 4 elements in the String array                                       
	                
	              for(int i=0;i<=arr.length;i++) {       
	        
	      //Here, no element is present at the iteration number arr.length, i.e 4  
	                   System.out.println(arr[i]);      
	      //So it will throw ArrayIndexOutOfBoundException at iteration 4           
	              }  
	    }
	}


