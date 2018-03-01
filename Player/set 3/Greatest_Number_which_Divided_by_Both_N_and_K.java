package greatest_number_divided_by_both_n_and_k;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,K,i,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		for(i=1;i<100;i++)
		{
			if(N%i==0 && K%i==0)
			{
				max=i;
			}
		}
		System.out.println(max);

	}

}
