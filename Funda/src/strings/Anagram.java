package strings;

import java.util.Arrays;

public class Anagram {
		public static void main(String[] args) {
		String s1="Hello";
		String s2="oHlel";
		
		if(s1.length() == s2.length()) {

		char c []=s1.toCharArray();
		char c1[]=s2.toCharArray();
		int cnt=0;
		//Arrays.sort(c);
		//Arrays.sort(c1);
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c1.length-1;j++)
			{
					char temp=c1[j];
					c1[j]=c1[j+1];
					c1[j+1]=temp;
				}
		}
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(c1));
			
			for(int i=0;i<c1.length;i++) {
				 
					if(c[i]==c1[i]) 
					{
						break;
						}
					else
						cnt++;
			}
			{	if(cnt==c1.length) 
					{
						System.out.println("Anagram");
					}
					else
						System.out.println("not Anagram");
					
				}
				
				}
		}
}
	

			
			/* boolean result = Arrays.equals(c, c1);

		      if(result) {
		        System.out.println(s1 + " and " + s2 + " are anagram.");
		      }
		      else {
		        System.out.println(s1 + " and " + s2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(s1 + " and " + s2 + " are not anagram.");
		    }
			 
			
				}*/
	
		
	
	      
	   

	      
	     




