import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		int N,temp,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		if(N==0) {
			System.out.println("not a valit number");
		}
		else
		{
			System.out.println("the valus are:");
			for(i=1;i<=N;i++)
			{
				temp=5;
				temp=temp*i;
				System.out.print(temp+" ");
			}
		}

	}

}
