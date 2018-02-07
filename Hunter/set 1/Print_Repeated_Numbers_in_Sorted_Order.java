package print_sorted_number;

import java.util.Scanner;

public class Sorted_Numbers {

	private static final int Null = 0;

	public static void main(String[] args) {
		int N,i,j,k=0,count=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		int[] array=new int[N];
		int[] arr=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			for(j=i+1;j<N;j++)
			{
				if(array[i]==array[j])
				{
					arr[k]=array[i];
					k++;
					count++;
				}
			}
		}
		for(i=0;i<count;i++)
		{
			for(j=i+1;j<count;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("sorted numbers:");
		for(i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
