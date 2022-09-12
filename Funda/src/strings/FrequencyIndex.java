package strings;

import java.util.Scanner;

public class FrequencyIndex {

	public static void main(String[] args) {
		String s = "Java is a programming language";  
        int[] freq = new int[s.length()];  
        int i, j;  
          Scanner sc=new Scanner(System.in);
          System.out.println("Give a character input who's frequency will check");
          char input=sc.next().charAt(0);
        //Converts given string into character array  
        char string[] = s.toCharArray();  
          
        for(i = 0; i <s.length(); i++) 
        {  
            freq[i] = 1;  
            for(j = i+1; j <s.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        } 

     //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != '0')  
            	System.out.println(s+" "+freq);
                System.out.println(string[i] + "-" + freq[i]);  
        }  
     
} } 


