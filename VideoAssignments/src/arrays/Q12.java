package arrays;
//12.What is use of variable arguments show with example?

public class Q12{
	static void fun2(String str, int... a)
		    {
		        System.out.println("String: " + str);
		        System.out.println("Number of arguments is: " + a.length);
		      for (int i : a)
		        System.out.print(i + " ");
		 
		        System.out.println();
		    }
		 
		    public static void main(String args[])
		    {
		        // Calling fun2() with different parameter
		        fun2("GeeksforGeeks", 100, 200);
		        fun2("CSPortal", 1, 2, 3, 4, 5);
		        fun2("forGeeks");
		    }
	}


