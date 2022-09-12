package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagarmwithoutFunction {
	static void anagram(String s1,String s2)
	{
		char ar1[]=s1.toCharArray();
		char ar2[]=s2.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		  int count=0 ; 
		if (ar1.length==ar2.length)
	      {
			for(int i=0;i<ar1.length;i++)
			{
				if(ar1[i]!=ar2[i])
						{
					      break;
						}
				else
					count++;
			}
			if(count ==ar1.length)
			{
				System.out.println("Given Strings are anagram");
			}
			else 
				System.out.println("Given Strings are not anagram ");
	      }
			else
		{
		System.out.println("Given Strings are not Anagram ");
		}}
		
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1=sc.next();
		
		System.out.println("Enter 2st String");
		String s2=sc.next();
		AnagarmwithoutFunction.anagram(s1, s2);
	}




	
	}


