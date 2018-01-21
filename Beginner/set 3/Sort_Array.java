import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int N,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
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
		System.out.println("sorted array:");
		for(i=0;i<N;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
