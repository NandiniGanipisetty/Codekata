package perfect_square_in_a_given_range;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		int l,r,i,square,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		l=sc.nextInt();
		r=sc.nextInt();
		for(i=1;i<=100000;i++)
		{
			square=i*i;
			if(square>=l&&square<=r)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
