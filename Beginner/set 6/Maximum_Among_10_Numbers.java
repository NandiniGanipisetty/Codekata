import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		int max,maximum,temp,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		maximum=sc.nextInt();
		for(i=0;i<9;i++)
		{
			temp=sc.nextInt();
			if(maximum>temp)
			{
				continue;
			}
			else
			{
				maximum=temp;
			}
		}
		System.out.println("maximum number:"+maximum);

	}

}
