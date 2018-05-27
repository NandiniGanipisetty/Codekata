package real_postion_array_element;

import java.util.Scanner;

public class FindPosition {

	static int temp=0;
	public static void main(String[] args) {
		int N,i,n = 0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] array=new int[N];
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		int position[]=evenPosition(array,N);
	    for(i=0;i<N;i++)
		{
			if(position[position.length-1]==array[i])
			{
				System.out.println(i+1);
			}
		}
		/*for(i=0;i*i<=N;i++)
		{
			
		}
		i--;
		System.out.println(i);
		int in=(1<<i);
		System.out.println(array[in-1]);*/
	}
	static int[] evenPosition(int[] arr,int n)
	{
		int i,count=0;
		int len=n/2;
		int[] array=new int[len];
		for(i=1;i<n;i+=2)
		{
			array[count]=arr[i];
			count++;
		}
		temp++;
		if(count!=1)
		{
			return evenPosition(array,count);
		}
		return array;
	}

}
