import java.util.Scanner;

public class Find_Odd {

	public static void main(String[] args) {
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first intervel:");
		a=sc.nextInt();
		System.out.println("enter the second intervel:");
		b=sc.nextInt();
		System.out.println("odd numbrs:");
		for(i=a+1;i<b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}

	}

}
