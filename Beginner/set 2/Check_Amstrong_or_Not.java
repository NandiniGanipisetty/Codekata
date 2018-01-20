import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int num,temp=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		int a=num;
		while(num!=0)
		{
			digit=num%10;
			temp=(digit*digit*digit)+temp;
			num/=10;
		}
		if(temp==a)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
