import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int N,temp,add=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		while(N!=0)
		{
			temp=N%10;
			add=add+temp;
			N/=10;
		}
		System.out.println(add);

	}

}
