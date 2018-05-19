package subarray_addition;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		int N,i,j,k,max=0,temp=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] array=new int[N];
		if(N>=1&&N<=100000)
		{
			for(i=0;i<N;i++)
			{
				array[i]=sc.nextInt();
			}
			for(i=0;i<N;i++)
			{
				for(j=i;j<N;j++)
				{
					temp=0;
					for(k=i;k<=j;k++)
					{
						temp=temp+array[k];
					}
					if(temp>max)
					{
						max=temp;
					}
				}
			}
			System.out.println(max);
		}
		else
		{
			System.out.println("not applicable");
		}

	}

}
