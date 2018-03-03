package even_factors_of_number;

import java.util.Scanner;

public class Even_Factors {

	public static void main(String[] args) {
		int N,i;
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		for(i=1;i<=N;i++)
		{
			if(N%i==0 && i%2==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
