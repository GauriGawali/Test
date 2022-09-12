package classAssignment;

import java.util.Scanner;

/*
11.	Write a Java program to count occurrences of a character in given string.
12.	Write a Java program to trim leading white space characters in a string.
13.	Write a Java program to count total number of words in a string.
14.	Write a Java program to find first occurrence of a word in a given string.
AddOns
15.	Write a Java program to search all occurrences of a character in given string.
16.	Write a Java program to convert uppercase string to lowercase.
17.	Write a Java program to remove all occurrences of a character from string. replaceALL()
18.	Write a Java program to trim trailing white space characters in a string.
19.	Write a Java program to trim both leading and trailing white space characters in a string.
20.	Write a Java program to remove all extra blank spaces from a given string.
 */
public class Q11ToQ20 {

//	public static void main(String[] args) {
	/*___11.	Write a Java program to count occurrences of a character in given string.
//_________________________________________________________________________________________
		String s = "aaaabbccAAdd";
		  char search = 'A';             // Character to search is 'a'.
		  
		  int count=0;
		  for(int i=0; i<s.length(); i++)
		  {
		      if(s.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  
		  
		  String str = " Java Exercises ";

	        // Trim the whitespace from the front and back of the
	        // String.
	        String new_str = str.trim();

	        // Display the strings for comparison.
	System.out.println("Original String: " + str);
	System.out.println("New String: " + new_str);___________________________________________________________
//13.	Write a Java program to count total number of words in a string.
		 String str = "welcome to javautorial on Java2blog";
		 
	        int count = 1;
	 
	        for (int i = 0; i < str.length() - 1; i++)
	        {
	            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of words in a string : " + count);
	    
		  
//________12.	Write a Java program to trim leading white space characters in a string._______________________________________________________________________________
	
	
	
	
	 String s = "India     Is My    Country";  
     //1st way  
     String noSpaceStr = s.replaceAll("\\s", ""); // using built in method  
     System.out.println(noSpaceStr);
     System.out.println(noSpaceStr);  
     //2nd way  
     char[] strArray = str.toCharArray();  
     StringBuffer stringBuffer = new StringBuffer();  
     for (int i = 0; i < strArray.length; i++) {  
         if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
             stringBuffer.append(strArray[i]);  
         }  
     }  
     String noSpaceStr2 = stringBuffer.toString();  
     System.out.println(noSpaceStr2);  
	
		  }
		

}*/

 /*
//___14.	Write a Java program to find first occurrence of a word in a given string._______________________________________________________________________
String firstCharStr;
char ch;

Scanner sc= new Scanner(System.in);

System.out.print("\nPlease Enter String to find First Occurrence =  ");
firstCharStr = sc.nextLine();

System.out.print("\nEnter the Character to Find =  ");
ch = sc.next().charAt(0);

int x = firstCharStr.indexOf(ch);

System.out.format("\nThe First Character Occurrence of %c at %d position", 
		firstCharStr.charAt(x), x);
}}*/
		
//________Q15_____	Write a Java program to convert uppercase string to lowercase.____________________	
		
		
		//String s="HELLO EVERYONE GOOD MORNING HAV a Nice day.";
		//System.out.println(s.toLowerCase());
//17.Write a Java program to remove all occurrences of a character from string. replaceALL()
		static void removeChar(String s, char c)
		{
		    int j, count = 0, n = s.length();
		    char []t = s.toCharArray();
		    for (int i = j = 0; i < n; i++)
		    {
		        if (t[i] != c)
		        t[j++] = t[i];
		        else
		            count++;
		    }
		     
		    while(count > 0)
		    {
		        t[j++] = '\0';
		        count--;
		    }
		     
		    System.out.println(t);
		}
		 
		// Driver Code
		public static void main(String[] args)
		{
		    String s = "geeksforgeeks";
		    removeChar(s, 'g');
		}
		}		
		
	
		
		