package strings;

import java.util.Arrays;

public class SimpleMethod {

	public static void main(String[] args) {
		String str="language";
		System.out.println("Printing character using method");
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
		String s1="java is a good programming language";
		String s2[]=s1.split(" ");
		System.out.println(Arrays.toString(s2));
		for(int i=s2.length-1;i>0;i--) {
			System.out.print(s2[i]+" ");
		}
		System.out.println(" ");
		//System.out.println(Arrays.toString(s1));
	}

}
