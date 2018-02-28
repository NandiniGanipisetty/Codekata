package sum_of_square_of_digits;

import java.util.Scanner;

public class Square_of_Digits {

	public static void main(String[] args) {
		int N,temp,square=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		while(N!=0)
		{
			temp=N%10;
			square=square+temp*temp;
			N/=10;
		}
		System.out.println(square);

	}

}
