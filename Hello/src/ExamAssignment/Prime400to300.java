package ExamAssignment;

public class Prime400to300 {

	public static void main(String[] args) {
		int j;
		for(int i=400;i>=300;i--)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
					break;
			}
			if(j>i/2)
			{
				System.out.println(i);
			}
		}
	}

}
