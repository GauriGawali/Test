package day7;

public class ArrayOfChar {
public void convertCase(char a[])
{
	for(int i=0;i<=a.length-1;i++)
		if(a[i]>='A' && a[i]<='Z')
			System.out.print((char)(a[i]+32)+" ");
		else if(a[i]>='a' && a[i]<='z')
		System.out.print((char)(a[i]-32)+" ");
		else
			System.out.print( " Not-Alphabate" );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char a[]= {'d','f','4','j','y'};
//ArrayOfChar o=new ArrayOfChar();
//o.convertCase(a);
	new ArrayOfChar().convertCase(a);
	}

}
