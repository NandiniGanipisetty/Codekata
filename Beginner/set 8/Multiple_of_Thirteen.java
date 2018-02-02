import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		if(N%13==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
