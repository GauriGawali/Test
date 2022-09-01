package arrays;

import java.util.Arrays;

public class StringInput {

	public static void main(String[] args) {
	String arr[]= {"java","is" ,"very","good" ,"language"};
	
	for(int i=0;i<arr.length;i++) 
	{
		System.out.println(arr[i]+"-"+arr[i].length());
	}
	for(int i=arr.length-1;i>=0;i--) 
	 {
		for(int j=arr[i].length()-1;j>=0;j--)
		{
			System.out.println(arr[i].charAt(j));
		}
	 	System.out.println();
	 }
	

	
	
	char ch[]= {'a','B','4','c','D'};
System.out.println(Arrays.toString(ch));
for(int i=0;i<ch.length;i++) 
{
	
if(ch[i]>='A'  && ch[i]<='Z') 
	ch[i]=(char)(ch[i]+32);
	
else if(ch[i]>='a'  && ch[i]<='z') 
	ch[i]=(char)(ch[i]-32);

}
System.out.println(Arrays.toString(ch));
	
	}
	}
