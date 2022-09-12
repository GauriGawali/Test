package day2;
//WAP to print Fibonacci series up to 20 terms.
public class quen7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=20;
		System.out.println(n1+" "+n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
