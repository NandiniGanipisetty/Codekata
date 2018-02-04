import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		int N,K,i,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size and k:");
		N=sc.nextInt();
		K=sc.nextInt();
		System.out.println("enter the numbers:");
		for(i=0;i<N;i++)
		{
			n=sc.nextInt();
			if(n==K)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
