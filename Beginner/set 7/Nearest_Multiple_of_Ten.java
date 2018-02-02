import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numebr:");
		a=sc.nextInt();
		if(a%10==0)
		{
			System.out.println(a);
		}
		else
		{
			a=(a/10)*10;
			b=a+10;
			System.out.println(b);
		}

	}

}
