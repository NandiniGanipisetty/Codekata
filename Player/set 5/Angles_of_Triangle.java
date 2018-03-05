package angles_of_a_triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the angles:");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		if(A==0||B==0||C==0)
		{
			System.out.println("no");
		}
		else
		{
			if(A+B+C==180)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}

	}

}
