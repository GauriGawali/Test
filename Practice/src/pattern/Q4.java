package pattern;
/*
1 
121 
12321 
1234321 
123454321 
1234321 
12321 
121 
1 

 */
public class Q4 {

	public static void main(String[] args) {
		System.out.println("*");
		for(int i=1;i<=4;i++)
		{
			System.out.print("*");
			for(int j=1;j<=i;j++)
			{
				System.out.print(+j);
			}
			
			for(int j=i-1;j>=1;j--)
		      {
		    	  System.out.print(j);
		      }
			System.out.println("*");
		}
		{
		for(int i=3;i>=1;i--)
		{ System.out.print("*");
			for(int j=1;j<=i;j++)
			{
			 System.out.print(j);
			}
			
			for(int j=i-1;j>=1;j--)
		      {
		    	  System.out.print(j);
		      }
			System.out.println("*");
		}
		}
	}


}