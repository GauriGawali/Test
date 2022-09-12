package day2;

import java.util.Scanner;

//WAP to check no is Krishnamurthy or not (Using while loop)
//i.e. 153 = 1! + 5! + 3! = 153.
public class quen8 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");

int fact=1,n1,n,i=1,r,sum=0;
n=sc.nextInt();
n1=n;
while(n>0)
{
	r=n%10;
	while(i<=r)
	{
		fact=fact*i;
		i++;
	}
	sum=sum+fact;
	n=n/10;
	}
if(n1==sum)

	System.out.println("num is krishmurti");

	else
		System.out.println("num is not krishmurti");
	}}*/
		
	
	 static int fact(int number)   
	    {   
	        int f = 1;   
	        while (number != 0) {   
	            f = f * number;   
	            number--;   
	        }   
	        return f;   
	    }   
	  
	    // create checkNumber() method that returns true when it founds number krishnamurthy   
	    static boolean checkNumber(int number)   
	    {   
	        int sum = 0;    //initialize sum to 0   
	          
	        int tempNumber = number;    //create a copy of the original number   
	          
	        //perform operation until tempNumber will not equal to 0  
	        while (tempNumber != 0) {   
	            // calculate the factorial of the last digit of the tempNumber and then add it to the sum  
	            sum = sum + fact(tempNumber % 10);   
	  
	            // replace the value of tempNumber by tempNumber/10   
	            tempNumber = tempNumber / 10;   
	        }   
	  
	        // Check whether the number is equal to the sum or not. If both are equal, number is krishnamurthy number  
	        if(sum == number)  
	            return true;  
	        else  
	            return false;  
	    }   
	  
	    // main() method start  
	    public static void main(String[] args)   
	    {   
	        int n;  //initialize variable n  
	          
	        //create scanner class object to read data from user  
	        Scanner sc = new Scanner(System.in);  
	          
	        //custom message  
	        System.out.println("Enter any number:");  
	          
	        //store user entered value into variable n  
	        n = sc.nextInt();  
	         
	        if (checkNumber(n))   
	            System.out.println(n + " is a krishnamurthy number");   
	        else  
	            System.out.println(n + "is not a krishnamurthy number");   
	    }   
	}  

 