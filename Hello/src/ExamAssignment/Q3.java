package ExamAssignment;

import java.util.Scanner;

//3.WAP to print squares from 1 to20
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a limt");
		int limit=sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			int sq=i*i;
			System.out.println(i+" " +sq);
		}
	}

}
/*****Output*********************/
/*
enter a limt
20
1 1
2 4
3 9
4 16
5 25
6 36
7 49
8 64
9 81
10 100
11 121
12 144
13 169
14 196
15 225
16 256
17 289
18 324
19 361
20 400
*/