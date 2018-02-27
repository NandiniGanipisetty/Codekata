package factorial_of_a_number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int N,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		for(i=1;i<=N;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
