package subset_array;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSet {

	public static void main(String[] args) {
		int N,M,i,j,k,count,flag=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		int[] array1=new int[N];
		int[] array2=new int[M];
		if(N>=1 && N<=1000000)
		{
			System.out.println("array elements:");
			for(i=0;i<N;i++)
			{
				array1[i]=sc.nextInt();
			}
			System.out.println("array elements:");
			for(i=0;i<M;i++)
			{
				array2[i]=sc.nextInt();
			}
			for(i=0;i<N;i++)
			{
				for(j=i;j<N;j++)
				{
					count=0;
					ArrayList<Integer>s=new ArrayList<Integer>();
					for(k=i;k<=j;k++)
					{
						s.add(array1[k]);
					}
					if(s.size()==array2.length)
					{
						for(int x=0;x<s.size();x++)
						{
							if(s.get(x)==array2[x])
							{
								count++;
							}
						}
					}
					if(count==s.size())
					{
						flag=1;
					}
				}
			}
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		else
		{
			System.out.println("not applicable");
		}

	}

}
