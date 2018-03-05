package range_of_a_given_number;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		if(N>=-32768&&N<=32767)
		{
			System.out.println("INT");
		}
		else if(N>=-2147483648&&N<=2147483647)
		{
			System.out.println("LONG LONG");
		}

	}

}
