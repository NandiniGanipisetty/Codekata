import java.util.Scanner;

public class Composite {

	public static void main(String[] args) {
		int a,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
