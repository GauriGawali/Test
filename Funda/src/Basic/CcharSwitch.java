package Basic;

import java.util.Scanner;

public class CcharSwitch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=sc.next().charAt(0);
	switch(ch)
	{
	case 'a':
		System.out.println("char is vowel");
		break;
	case 'e':
		System.out.println("char is vowel");
		break;

	case 'i':
		System.out.println("char is vowel");
		break;

	case 'o':
		System.out.println("char is vowel");
		break;

	case 'u':
		System.out.println("char is vowel");
		break;

	case 'A':
		System.out.println("char is vowel");
		break;
	case 'E':
		System.out.println("char is vowel");
		break;
	case 'I':
		System.out.println("char is vowel");
		break;

	case 'O':
		System.out.println("char is vowel");
		break;
	case 'U':
		System.out.println("char is vowel");
		break;
	default:
		System.out.println("char is consonant");
	}
	

	}

}
