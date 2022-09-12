package ExamAssignment13August;

public class Q3B {
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
		Q3B ab=new Q3B();
		System.out.println("Greatest char is");
		ab.compare('z', 'b');
	}

}
