package polymorphism;

public class Addition { 
void add(int a,int b)
	{
		System.out.println(a+b);
	}
void add(int a , float b)
{ System.out.println(a+b);
	}

void add(String a, String b, float c)
{ System.out.println(a+""+b+""+c);
	}

	

	public static void main(String[] args) {
Addition a=new Addition();
a.add(1, 02);
a.add(2, 20.50f);
a.add("gauri", "neha", 10);

	}

}
