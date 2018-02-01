import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int N,M,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		M=sc.nextInt();
		a=N+M;
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
