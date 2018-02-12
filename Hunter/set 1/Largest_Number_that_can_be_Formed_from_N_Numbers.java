package large_number;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		int N,i,j,temp,rev;
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
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		i=0;
		j=N-1;
		while(j>i)
		{
			rev=array[i];
			array[i]=array[j];
			array[j]=rev;
			i++;
			j--;
		}
		String str="";
		for(i=0;i<N;i++)
		{
			str=str+array[i];
		}
		int num=Integer.parseInt(str);
		System.out.println("largest number:"+str);

	}

}
