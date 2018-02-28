package division_of_l_and_r;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int L,R,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter l and r:");
		L=sc.nextInt();
		R=sc.nextInt();
		for(i=1;i<10000;i++)
		{
			if(i%L==0 && i%R==0)
			{
				System.out.print(i);
				break;
			}
		}

	}

}
