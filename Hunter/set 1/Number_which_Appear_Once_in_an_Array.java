package appear;

import java.util.Scanner;

public class Non_Repeat {

	public static void main(String[] args) {
		int N,i,j,temp = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
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
				if(array[i]!=array[j])
				{
					temp=i;
				}
			}
		}
		System.out.println(temp);

	}

}
