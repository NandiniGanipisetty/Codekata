package sum_of_array_elements;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int N,i,j,k;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] array=new int[N];
		if(N>=1&&N<=1000)
		{
			for(i=0;i<N;i++)
			{
				array[i]=sc.nextInt();
			}
			for(i=0;i<N-2;i++)
			{
				for(j=i+1;j<N-1;j++)
				{
					for(k=j+1;k<N;k++)
					{
						if(array[i]+array[j]==array[k])
						{
							System.out.println(array[i]+" "+array[j]+" "+array[k]);
						}
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
