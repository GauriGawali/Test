package ExamAssignment10sept;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 3.	The encryption of alphabets are to be done as follows:	[2]
A=1,B=2,C=3,Z=26
The potential of a word is found by adding the encrypted value of the alphabets.

Example: KITE
Potential = 11 + 9 + 20 + 5 = 45
Accept a sentence Decode the words according to their potential 

Output the result in format given below:
 Input:THE SKY IS THE LIMIT.

OUTPUT:THE=33,SKY=55,IS=28,THE=33,LIMIT=63 

 */
public class Q3 {

	public static void main(String[] args) {
		 Scanner SC = new Scanner(System.in);
	        System.out.println("ENTER THE SENTENCE:");
	        String s = SC.nextLine();
	        String str[]=s.split(" ");
	        /*for(int i=0;i<str.length;i++) {
	        	int sum=0;
	        	char ch[]=str[i].toCharArray();
	        	for(int j=0;j<ch.length;j++)
	        	{
	        		sum=sum+(ch[j]-64);
	        	}
	        	System.out.println(str[i]+" "+sum);
	        }*/
	        for(int i=0;i<str.length;i++) {
	        	int sum=0;
	        	char ch[]=str[i].toCharArray();
	        	for(int j=0;j<ch.length;j++)
	        	{
	        		sum=sum+(ch[j]-96);
	        	}
	        	System.out.println(str[i]+" "+sum);
	        }
	}
}