package division_of_n;

import java.util.Scanner;

public class Divide_N {

	public static void main(String[] args) {
		int N,i,flag = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		for(i=1;i<N;i++)
		{
			if(N%i==0 && N/i<N)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
