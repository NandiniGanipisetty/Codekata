import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,temp=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("not a valit number");
		}
		else
		{
			for(i=1;i<=num;i++)
			{
				temp=i*temp;
			}
			System.out.println("the value is:");
			System.out.println(temp);
		}
	}

}
