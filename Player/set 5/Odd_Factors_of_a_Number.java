package odd_factors_of_a_number;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		int N,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		for(i=2;i<=N;i++)
		{
			if(N%i==0&&i%2!=0)
			{
				System.out.println(i);
			}
		}
		

	}

}
