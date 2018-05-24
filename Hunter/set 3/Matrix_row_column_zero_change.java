package matrix;

import java.util.Scanner;

public class Matrix_Zero {

	public static void main(String[] args) {
		int N,M,i,j;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		int[][] array=new int[N][M];
		for(i=0;i<N;i++)
		{
			for(j=0;j<M;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		checkZero(array,N,M);
		for(i=0;i<N;i++)
		{
			for(j=0;j<M;j++)
			{
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}

	}
	static void checkZero(int[][] arr,int N,int M)
	{
		int i,j;
		for(i=0;i<N;i++)
		{
			for(j=0;j<M;j++)
			{
				if(arr[i][j]==0)
				{
					changeZero(arr,N,M,i,j);
				}
			}
		}
		for(i=0;i<N;i++)
		{
			for(j=0;j<M;j++)
			{
				if(arr[i][j]==-1)
				{
					arr[i][j]=0;
				}
			}
		}
	}
	static void changeZero(int[][] arr,int N,int M,int x,int y)
	{
		int i,j;
		for(i=0;i<M;i++)
		{
			if(arr[x][i]!=0)
			{
				arr[x][i]=-1;
			}
		}
		for(j=0;j<N;j++)
		{
			if(arr[j][y]!=0)
			{
				arr[j][y]=-1;
			}
			
		}
	}

}
