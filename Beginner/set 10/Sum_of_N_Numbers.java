import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int N,n,temp=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		System.out.println("enter the numbers:");
		for(i=0;i<N;i++)
		{
			n=sc.nextInt();
			temp=temp+n;
		}
		System.out.println(temp);

	}

}
