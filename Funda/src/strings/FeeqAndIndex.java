package strings;

import java.util.Scanner;

public class FeeqAndIndex {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String contain");
	String sent=sc.next();
	
	System.out.println("Enter a which character find in String frequency");
	char ch=sc.next().charAt(0);
	char[] c=sent.toCharArray();
	int cnt=0;
	System.out.println(ch+" " );
	
	for(int i=0;i<c.length;i++) {
		if(c[i]==ch) {
			cnt++;
			System.out.println("index Position is "+i);
		}
	}
		System.out.println("Frequency is:"+cnt);
	System.out.println("Enter a charcter which convert in upper case");
	
	char ch1=sc.next().charAt(0);
	char[] c1=sent.toCharArray();
	for (int i = 0; i < c1.length; i++) {
		if(ch1==c1[i])
		 
             ch1 = (char) ((int) c1[i] - 32);
	}
       System.out.println(ch1);
	
        
                
                 }
	}


         


