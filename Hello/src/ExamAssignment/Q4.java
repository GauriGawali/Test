package ExamAssignment;

import java.util.Scanner;

//4.WAP to accept base and index from user and calculates power
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a base");
		int b=sc.nextInt();
		System.out.println("enter a index");
		int idx=sc.nextInt();
		
		int product=1;
		for(int c=1;c<=idx;c++)
		{
			product=product*b;
		}
		System.out.println(product);
		
	}

}
/*********OUTPUT************/
/*enter a base
2
enter a index
3
8 */