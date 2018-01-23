import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		int N,n1=0,n2=1,n3,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
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
