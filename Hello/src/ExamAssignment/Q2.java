package ExamAssignment;

import java.util.Scanner;

//2.Write a program to find frequency of each digit in a given integer.
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,i,c,d,k;
		System.out.println("Enter a number");
		 no=sc.nextInt();
		System.out.println("Frequency of digit");
		for(i=0;i<=9;i++)
		{
			c=0;
			k=no;
		
		while(k>0)
		 {
			d=k%10;
			if(d==i)
			{
				c++;
			}
			k=k/10;
			}
		if(c>0)
		    {
			System.out.println(i+" "+c);
		    }
		 }
		}
		
	}
/*Enter a number
1123
Frequency of digit
1 2
2 1
3 1
*/

