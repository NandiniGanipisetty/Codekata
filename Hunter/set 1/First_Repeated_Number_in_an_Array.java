package first_repeat;

import java.util.Scanner;

public class Repeat {
	static int RepeatedNum()
	{
		int N,i,j,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		int[] array=new int[N];
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
					return array[i];
				}
			}
		}
		return array[i];
		
	}

	public static void main(String[] args) {
		System.out.println("repeated number:"+RepeatedNum());

	}

}
