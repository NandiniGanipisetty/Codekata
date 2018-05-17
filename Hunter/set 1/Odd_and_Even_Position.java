package odd_and_even_position;

import java.util.Scanner;

public class Odd_or_Even {

	public static void main(String[] args) {
		int N,i,x=0,y=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		if(N>=1 && N<=10000)
		{
			int[] array=new int[N];
			int[] arr1=new int[10];
			int[] arr2=new int[10];
			for(i=0;i<N;i++)
			{
				array[i]=sc.nextInt();
			}
			for(i=0;i<N;i++)
			{
				if(i%2!=0 && array[i]%2==0)
				{
					arr1[x]=array[i];
					x++;
				}
				else if(i%2==0 && array[i]%2!=0)
				{
					arr2[y]=array[i];
					y++;
				}
			}
			for(i=0;i<x;i++)
			{
				System.out.print(arr2[i]+" ");
			}System.out.println();
			for(i=0;i<y;i++)
			{
				System.out.print(arr1[i]+" ");
			}
		}
		else
		{
			System.out.println("not applicable");
		}

	}

}
