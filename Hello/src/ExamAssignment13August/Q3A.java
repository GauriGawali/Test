package ExamAssignment13August;

public class Q3A {
	public void compare(int a, int b) {
        
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }
public void compare(char a, char b) {
        int x = (int)a;
        int y = (int)b;
        
        if (x > y) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
	}

	
public static void main(String[] args) {
		Q3A a=new Q3A();
		System.out.println("Greatest integer num value is");
	    a.compare(10, 50);
	    
	   
		System.out.println("Greatest char is");
		a.compare('z', 'b');

	}
}
