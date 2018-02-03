import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int a,temp,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		a=sc.nextInt();
		while(a!=0)
		{
			temp=a%10;
			rev=rev*10+temp;
			a/=10;
		}
		System.out.println(rev);
	}

}
