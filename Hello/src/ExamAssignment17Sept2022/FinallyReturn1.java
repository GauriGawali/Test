package ExamAssignment17Sept2022;
/*WAP to return int value in try block and return int value in finally block and 
 * observe which return takes precedence
 */

public class FinallyReturn1
		{
		 int m1()
		 {
		 try {
		       System.out.println("I am in try block");
		      return 30;
		  } 
		finally {
		       System.out.println("I am in finally block");	
		      return 50;
		  }
		}
		public static void main(String[] args) 
		{
		 FinallyReturn1 obj = new FinallyReturn1();
		   System.out.println(obj.m1());
		  }
		}
	


