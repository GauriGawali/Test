package polymorphism;

public class Areaa {
 void Area(int r, float pi)
{ 
	float area=pi*r*r;
    System.out.println("area of cicle is:"+area);
	}

void Area(int s)
{
    int	square=s*s;
    System.out.println("Area of square is:"+square);
}
void Area(int w,int l)
{
	int rectangle=w*l;
	System.out.println("Area of Rectangle is:"+rectangle);
}
void Area(float h, float b)

{   float triangle=(h*b)/2;
    System.out.println("Area of Triangle is:"+triangle);
	}

	public static void main(String[] args) {
		Areaa ar=new Areaa();
		ar.Area(5,3.14f);
		ar.Area(5);
		ar.Area(3.0f, 10.0f);
		ar.Area(5,6);

	}

}
