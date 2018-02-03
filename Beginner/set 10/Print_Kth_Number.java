import java.util.Scanner;

public class K_th_Number {

	public static void main(String[] args) {
		int N,K,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the numbers:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Kth number:"+array[K-1]);

	}

}
