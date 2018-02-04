import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int N,K,temp=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		for(i=0;i<K;i++)
		{
			temp=temp*N;
		}
		System.out.println(temp);

	}

}
