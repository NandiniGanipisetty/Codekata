import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		if(num==0||num==1)
		{
			System.out.println("no");
		}
		else
		{
			for(i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
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
