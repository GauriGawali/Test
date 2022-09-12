package strings;

import java.util.Scanner;

public class Replace {
static void replaceChar(String s,char c1,char c2) {
	System.out.println("old String:"+s);
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==c1)
		{
			ch[i]=c2;
		}
	}
	String s1=new String(ch);
	System.out.println("new String:"+s1);
}
	public static void main(String[] args) {
	Replace r=new Replace();
	Scanner sc=new Scanner(System.in);
	String s="hello java";
	System.out.println("Enter a character which has to be replaced");
    char c1=sc.next().charAt(0);
    System.out.println("new character");
    char c2=sc.next().charAt(0);
    replaceChar(s, c1, c2);
replaceChar("Hello everyone ", 'e', 'E');
	}

}
