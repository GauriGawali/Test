package forLoop;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=2;i<=11;i++)
		{int c=a+b;
	
		a=b;
		b=c;
		
		System.out.print(c+" ");
		}
		
	}

}
