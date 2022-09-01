package Basic;

public class PalindromeNo {

	public static void main(String[] args) {
	int r,sum=0,temp;
	 int no=444;
		 temp=no;
while(temp>0)
{
	r=temp%10;
	sum=sum*10+r;
	
	temp=temp/10;}
System.out.println(temp);
System.out.println(sum);
if(no==sum)
{
	System.out.println("No is Palindrome");}
	else 
		System.out.println("NO is not palindrome");
	}
}


