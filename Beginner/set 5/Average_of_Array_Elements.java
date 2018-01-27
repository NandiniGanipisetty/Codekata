import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int N,i,sum=0,avg;
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
			sum=sum+array[i];
		}
		avg=sum/N;
		System.out.println("averge of array elements:"+avg);

	}

}
