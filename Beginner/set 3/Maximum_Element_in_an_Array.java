import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		int N,i,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of  an array:");
		N=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		max=array[0];
		for(i=0;i<N;i++)
		{
		if(max<array[i])
		{
			max=array[i];
		}
		}
		System.out.println("maximum element:"+max);
		

	}

}
