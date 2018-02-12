package index;

import java.util.Scanner;

public class Equal_Index {

	public static void main(String[] args) {
		int N,i,j=0,count=0,temp,inc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		int[] array=new int[N];
		int[] arr=new int[10];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			if(array[i]==i)
			{
				arr[j]=i;
				j++;
				count++;
			}
			else if(array[i]!=i)
			{
				inc++;
			}
			
		}
		if(inc==N)
		{
			System.out.println("-1");
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
		for(i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
