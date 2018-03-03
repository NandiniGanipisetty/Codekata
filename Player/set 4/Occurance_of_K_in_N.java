package occurance_of_k_in_n;

import java.util.Scanner;

public class Occurance_of_K {

	public static void main(String[] args) {
		int N,K,count=0,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		String temp=Integer.toString(N);
		int[] array=new int[temp.length()];
		for(i=0;i<temp.length();i++)
		{
			array[i]=temp.charAt(i)-'0';
		}
		for(i=0;i<array.length;i++)
		{
			if(array[i]==K)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
