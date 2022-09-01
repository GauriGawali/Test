package whileloop;

import java.util.Scanner;

public class MaxAndMinDigitNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	int max =no%10; int min = no%10;
	
	while(no!=0)
	{
		int r=no%10;
		if(r<min)
		
			 min=r;
			 		
		if(r>max)
			max=r;
		no=no/10;
	}
	
	System.out.println(max);
  	System.out.println(min);
	
	
}
	}


