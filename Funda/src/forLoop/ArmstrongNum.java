package forLoop;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
int a,arm=0,n,temp,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
temp=n;
while(temp!=0)
{ c++;
temp=temp/10;
}
temp=n;
int sum=0;
while(temp!=0)
{
	int product=1;
	int r=temp%10;
	for(int i=1;i<=c;i++)
		{product=product*r;
	}
sum=sum+product;
temp=temp/10;
}
if(n==sum)
	System.out.println("no is armstrong");
else
	System.out.println("not aramstrong ");
	}}