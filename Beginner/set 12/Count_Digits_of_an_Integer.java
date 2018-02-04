import java.util.Scanner;

public class Digit_Count {

	public static void main(String[] args) {
		int N,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		while(N!=0)
		{
			N/=10;
			count++;
		}
		System.out.println("count:"+count);

	}

}
