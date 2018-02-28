package right_shift_by_k_times;

import java.util.Scanner;

public class Right_Shift {

	public static void main(String[] args) {
		int N,K,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size and k:");
		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<K;i++)
		{
			temp=array[N-1];
			for(j=N-1;j>0;j--)
			{
				array[j]=array[j-1];
			}
			array[j]=temp;
		}
		System.out.println("revised array:");
		for(i=0;i<N;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
