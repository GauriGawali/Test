package forLoop;

import java.util.Scanner;

public class Print1121231234123121 {

	public static void main(String[] args) {
		/*int i, j, rows;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of rows you want to print: ");  
		rows = sc.nextInt();          
		for (i= 1; i<= rows-1; i++)  
		{  
		for (j=1; j<=i; j++)   
		{
		System.out.print((char)(64+j));  
		}   
		System.out.println("");   
		}   
		for (i=rows-1; i>=1; i--)  
		{  
		for(j=1; j <= i-1;j++)  
		{  
		System.out.print((char)(64+j));  
		}  
		System.out.println("");  
		}  */
		/*int i, j, rows;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of rows you want to print: ");  
		rows = sc.nextInt();          
		for (i= 1; i<= rows; i++)  
		{  
		for (j=1; j<=i; j++)   
		{
		System.out.print((char)(64+i));  
		}   
		System.out.println("");   
		}   
		for (i=rows-1; i>=1; i--)  
		{  
		for(j=1; j <= i;j++)  
		{  
		System.out.print((char)(64+i));  
		}  
		System.out.println("");
	}*/
		char ch='a';
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println(" ");
		} ch--;
			for(int i=r-1;i>=1;i--)
			{ch--;
				for(int k=1;k<=r-i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch+" ");
				}
				
				System.out.println(" ");
			}
		}
	}

