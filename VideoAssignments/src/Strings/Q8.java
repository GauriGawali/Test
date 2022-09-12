package Strings;
//. Write a Java program to remove first and last occurrence of a word from string.

public class Q8 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Function to remove the first and
	    // the last character of a string
	    public static String
	    removeFirstandLast(String str)
	    {
	 
	        // Removing first and last character
	        // of a string using substring() method
	        str = str.substring(1, str.length() - 1);
	 
	        // Return the modified string
	        return str;
	    }
	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        // Given String str
	        String str = "GeeksForGeeks";
	 
	        // Print the modified string
	        System.out.print(
	            removeFirstandLast(str));
	    }
	
	}


