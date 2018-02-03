import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		int a,b,i,temp = 0,lcm;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				temp=i;
			}
		}
		lcm=(a*b)/temp;
		System.out.println(lcm);
	}

}
