import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numebr:");
		N=sc.nextInt();
		if(N%2==0)
		{
			System.out.println(N);
		}
		else
		{
			N=N-1;
			System.out.println(N);
		}

	}

}
