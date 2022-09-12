import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int firstno=0;
int secondno=0;
int sum=0;
System.out.println("enter first no:");
firstno=input.nextInt();
System.out.println("enter second no:");
secondno=input.nextInt();

sum=firstno + secondno;
System.out.println("sum of both no:" + sum);

	}
	

}
