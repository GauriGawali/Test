package Strings;

import java.util.Scanner;

/*
.Write a program that takes your full name as input and displays the
abbreviations of the first and middle names except the last name which is
displayed as it is. For example, if your name is Robert Brett Roser, then the
output should be R.B.Roser.

 */
public class Q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String sr="";
		sr=sr+st.charAt(0);
		sr=sr+".";
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)== ' ' && st.charAt((i+1))!= ' ' && (i+1)<st.length()){
				sr=(sr+st.charAt(i+1)).toUpperCase();
				sr=sr+".";
				
			}
		}
		String last_wrd=" ";
		//to get last word
		for(int i=st.length()-1;i>=0;i--)
		{
			last_wrd= st.substring(i+2);
			break;
		}

	
	//to remove last"."
	sr=sr.substring(0,sr.length()-2);
	sr=sr+last_wrd;
	System.out.println(sr);

}
}