import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		int a,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
