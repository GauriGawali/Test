package basic;

public class PiramidPattern {

	public static void main(String[] args) {
		int i,b,j;
		for(i=1;i<=5;i++)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					continue;}
					System.out.print("* ");
				}
				System.out.println();
		}
				for(i=4;i>=1;i--)
				{
					for(int sp=4;sp>=i;sp--)
					{
						System.out.print(" ");
					}
					for(j=1;j<=i;j++)
					{
						if(i%2==0)
						{
							continue;}
							System.out.print("* ");
						}
						System.out.println();
						
			}
	}
}
		