import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,N;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size:");
		N=sc.nextInt();
		System.out.print(n2+" ");
		for(i=1;i<N;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}

	}

}
