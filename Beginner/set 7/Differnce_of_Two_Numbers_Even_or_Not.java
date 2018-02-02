import java.util.Scanner;

public class Differnce {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		if(c%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
