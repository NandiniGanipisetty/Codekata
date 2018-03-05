package perimeter_and_area_of_a_rectangle;

import java.util.Scanner;

public class Perimeter_and_Area {

	public static void main(String[] args) {
		int i,j,len = 0,wid = 0,peri,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the perimeter and area:");
		peri=sc.nextInt();
		area=sc.nextInt();
		for(i=1;i<20;i++)
		{
			for(j=1;j<20;j++)
			{
				if(i*j==area && peri/(i+j)==2)
				{
					len=i;
					wid=j;
				}
			}
		}
		if((2*len)+(2*wid)==peri)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
