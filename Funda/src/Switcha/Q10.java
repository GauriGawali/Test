package Switcha;

import java.util.Scanner;

//10)find which is greatest  number in between 2 numbers  using switch.
public class Q10 {

	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		 System.out.println("Enter 1st number : ");
	       int num1=s.nextInt();
	       System.out.println("Enter 2nd number : ");
	       int num2=s.nextInt();
	       
	       System.out.println("Enter your Choice : ");
	       System.out.println(" 1 : Maximum number ..");
	       System.out.println(" 2 : Minimum number ..");
	       int ch=s.nextInt();
	       switch(ch)
	       {
	       case 1 : if (num1>num2)
				       {
				    	 System.out.println("Maximum number : "+num1);   
				       }
	                else
	                   {
	                	System.out.println("Maximum number : "+num2);
	                    }
	                      break;
	       case 2 : if (num1<num2)
					       {
					    	 System.out.println("Minimum number : "+num1);   
					       }
					    else
					       {
					    	System.out.println("Minimum number : "+num2);
					       }
	                         break;
	         default : System.out.println("Please Choose 1 or 2");               
	       
	       }
	       
		}
        

    }

