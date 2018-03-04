package check_array_is_sorted;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		int N,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<N-1;i++)
		{
			if(array[i]<array[i+1])
			{
				count++;
			}
		}
		if(count==N-1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
