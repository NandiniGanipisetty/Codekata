package reverse_a_number;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int N,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		while(N!=0)
		{
			temp=N%10;
			rev=rev*10+temp;
			N/=10;
		}
		System.out.println(rev);

	}

}
