package sum_of_digits_of_a_number;

import java.util.Scanner;

public class Check_Palindrome {

	public static void main(String[] args) {
		int N,sum=0,temp,rev=0,temp1,temp2;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		while(N!=0)
		{
			temp=N%10;
			sum=sum+temp;
			N/=10;
		}
		temp1=sum;
		while(sum!=0)
		{
			temp2=sum%10;
			rev=rev*10+temp2;
			sum/=10;
		}
		if(rev==temp1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
