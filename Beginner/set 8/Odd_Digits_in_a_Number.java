import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		int N,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		int array[];
		while(N!=0)
		{
			temp=N%10;
			if(temp%2!=0)
			{
				System.out.print(temp+" ");
			}
			N/=10;
		}
	}

}
