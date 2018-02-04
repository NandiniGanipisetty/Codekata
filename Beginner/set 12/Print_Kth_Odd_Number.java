import java.util.Scanner;

public class Odd_Number {

	public static void main(String[] args) {
		int N,K,i,n = 0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size and k:");
		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the numbers:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<=K;i+=2)
		{
			n=array[i];
			count++;
		}
		if(count>0)
		{
		System.out.println(n);
		}

	}

}
