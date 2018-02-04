import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		int min,temp,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		min=sc.nextInt();
		for(i=0;i<9;i++)
		{
			temp=sc.nextInt();
			if(min>temp)
			{
				min=temp;
			}
		}
		System.out.println("min:"+min);

	}

}
