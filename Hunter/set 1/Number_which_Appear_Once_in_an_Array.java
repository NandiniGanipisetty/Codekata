package appear;

import java.util.Scanner;

public class Non_Repeat {

	public static void main(String[] args) {
		int N,i,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int a:array)
		{
			result=result^a;
		}
		System.out.println(result);
	}

}
