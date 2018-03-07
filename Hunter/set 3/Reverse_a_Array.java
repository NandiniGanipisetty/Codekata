package reverse_list;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int N,i;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] array=new int[N];
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+"->");
		}

	}

}
