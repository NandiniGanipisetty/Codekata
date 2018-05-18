package sum_is_zero;

import java.util.Scanner;

public class Sum_of_Array_Elements {

	public static void main(String[] args) {
		int N,i,j;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] array=new int[N];
		if(N>=1 && N<=100000)
		{
			for(i=0;i<N;i++)
			{
				array[i]=sc.nextInt();
			}
			for(i=0;i<N-1;i++)
			{
				for(j=i+1;j<N;j++)
				{
					if(array[i]+array[j]==0)
					{
						System.out.println(array[i]+" "+array[j]);
					}
				}
			}
		}
		else
		{
			System.out.println("not applicable");
		}

	}

}
