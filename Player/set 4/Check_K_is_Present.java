package search_k_is_present;

import java.util.Scanner;

public class Check_K {

	public static void main(String[] args) {
		int N,K,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]==K)
			{
				count++;
			}
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
