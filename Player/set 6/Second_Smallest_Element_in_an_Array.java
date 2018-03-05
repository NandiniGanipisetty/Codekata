package second_smallest_element_in_an_array;

import java.util.Scanner;

public class Second_Smallest_Element {

	public static void main(String[] args) {
		int N,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array:");
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
		System.out.println(array[1]);

	}

}
