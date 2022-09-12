package day2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=10;i++)
		{ 
			if(i%2==0)
				
			System.out.println(i*i*i);
			else
				System.out.println(i*i);
		}*/
		
		/*int a=0;
		for(int i=1;i<=10;i++)
		{
			a=(a*10)+3;
			System.out.println(a);
		}
*/
	/*	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(i+" "+j);
			}
		}*/
		
		
		/*int i=1,j=1;
		while(i<=5)
		{
			while(j<=5) {
				System.out.println(i+" "+j);
				j++;
			}
			i++;
			j=i;*/
	/*	int n=5;
		
		for(int i=1;i<=10;i++)
		{
			//System.out.println(n+"*"+i+"="+(n*i));
			System.out.println(n*i);
		}*/
		
		/*for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
			}
		}*/
		/*int i=2,j=1;
		while(i<=5)
		{
			while(j<=10)
			{
				System.out.println(i*j);
				j++;
			}i++;j=1;
		}*/
	/*	int fact,sum;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			
			sum=sum+fact;
			fact=1;
		}
		System.out.println("fact");
		}*/
		/*
		* 
		** 
		*** 
		**** 
		**** 
		*** 
		** 
		* 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		for( int i=4;i>=1;i--)
		{
			for( int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}*/
		/*
		1111 
		1111 
		1111 
		1111
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("1");
				
				}
			System.out.println(" ");
		}*/
		/*
		1 
		12 
		123 
		1234 

		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");

		}*/
		/*
1 
11 
111 
1111 
		 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
				
			}
			System.out.println(" ");
		}*/
		
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				
					System.out.print("0");
				
				else 
					System.out.print("1");
				
			}
		
		System.out.println(" ");
	}*/
	/*	int sp=4;
		for(int i=1;i<=4;i++)
		{
for(int k=1;k<=sp;k++)
{
	System.out.print(" ");
	}
for(int j=1;j<=i;j++)
{
	System.out.print("*");
	}
sp--;
System.out.println("");
}*/
		
		/*
		
     *
    * *  
   * * *  
  * * * *  
		
		int sp=4; int i;
		for( i=0;i<4;i++)
		{
			for(int k=0;k<=sp;k++)
			{
				System.out.print(" ");
			
			}
		for(intj=0;j<=i;j++)
			{
				System.out.print("* ");
				
			} sp--;
		System.out.println(" ");
		}
		}*/
		/*
		
	      @ 
	     # # 
	    @ @ @ 
	   # # # # 
		
		int sp=4;
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(i%2==0)
				{
					System.out.print(" @");
				}
				else
				{
					System.out.print(" #");}}
					sp--;
					System.out.println(" ");
					
				
			
		
		
			}
		}
		*/
		/*
		**********
		**********
		**********
		********** 
		
		for(int i=1;i<=4;i++) {
			for(int j=0;j<=9;j++)
			{System.out.print("*");
			
			}
			System.out.println(" ");
			*/
	/*	
		
		*
		**
		***
		****
		*****
		
	
		for(int i=1;i<=5;i++)
		{
for(int j=1;j<=i;j++)
{
	System.out.print("*");
	}
System.out.println(" ");
	}/*
		int sp=4;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			sp--;
			System.out.println(" ");
		}
} */
/*
     1  
    2 2  
   3 3 3  
  4 4 4 4  
 5 5 5 5 5  
 

	int sp=5; 
	for( int i=1;i<=5;i++)
	{
		for(int k=1;k<=sp;k++)
		{
			System.out.print(" ");
		
		}
	for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
			
		} sp--;
	System.out.println(" ");
	}*/
	/*
	   *
      ***
     *****
    *******
   *********
		for( int i=1;i<=5;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			
			}
		for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			} sp--;
		System.out.println(" ");
		}*/
	
		/*1
	     212
	    32123
	   4321234
	  543212345
	*/}
	/*int i, j, k, n,a; 
	  Scanner sc=new Scanner(System.in);
	  System.out.println(" ");
	//Scanner sc = new Scanner(System.in); 
	//System.out.println("Enter the n values"); 
	n = sc.nextInt(); 
	a = n; 
	for (i = 1; i <= n; i++) 
	{ 
		for (j = 5; j > 1; j--) 
		{ 
			System.out.print(" "); 
		} 
		for (k = i; k != 0; k--) 
		{ 
			System.out.print(k); 

		} 
		n--; 

		for (int l = 2; l <= i; l++) 
		{ 
			System.out.print(l); 

		} 
		System.out.println(); */
	} 
	
