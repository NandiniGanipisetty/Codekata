package check_if_n_is_power_of_k;

import java.util.Scanner;

public class Check_Power {

	public static void main(String[] args) {
		int N,K,count=0,temp=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		while(N!=0)
		{
			if(N%K==1)
			{
				count++;
			}
			N/=K;
		}
		if(count==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
