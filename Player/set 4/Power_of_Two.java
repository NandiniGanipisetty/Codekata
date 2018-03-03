package power;

import java.util.Scanner;

public class Power_of_Two {

	public static void main(String[] args) {
		int N,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		if(N==1)
		{
			System.out.println("no");
		}
		else
		{
			while(N!=0)
			{
				if(N%2==1)
				{
					count++;
				}
				N/=2;
			}
			if(count==1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		

	}

}
