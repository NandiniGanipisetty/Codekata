import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		int N,i,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of  an array:");
		N=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		min=array[0];
		for(i=0;i<N;i++)
		{
		if(min>array[i])
		{
			min=array[i];
		}
		}
		System.out.println("maximum element:"+min);
		


	}

}
