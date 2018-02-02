import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int N,L,R;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		L=sc.nextInt();
		R=sc.nextInt();
		if(N>L&&N<R)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
