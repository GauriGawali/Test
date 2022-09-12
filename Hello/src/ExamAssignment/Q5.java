package ExamAssignment;

import java.util.Scanner;

//5.Find all prime number between 400 to 300;
public class Q5 {

	public static void main(String[] args) {
		int flag,j;
Scanner sc=new Scanner(System.in); 
System.out.println("Enter a min value");
int min=sc.nextInt();
System.out.println("Enter a max value");
int max=sc.nextInt();
System.out.println("Prime no between" +max+" "+min);

for(int i=max;i>=min;i--)
{
	if(i==1||i==0)
		continue;
	flag=1;
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
			flag=0;
			break;
		}
	}
	if(flag==1)
		System.out.println(i);
	

	}

}
}
