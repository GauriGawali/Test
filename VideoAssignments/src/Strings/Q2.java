package Strings;
//1.2. Write a code to prove that strings are immutable in java?
public class Q2 {

	public static void main(String[] args) {
		String s1="hello";
		s1.concat("World");
		System.out.println(s1);
	}

}
