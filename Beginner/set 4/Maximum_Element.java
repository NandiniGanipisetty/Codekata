import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		int N,max,temp,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		N=sc.nextInt();
		System.out.println("enter the numbers:");
		max=sc.nextInt();
		for(i=0;i<N;i++)
		{
			temp=sc.nextInt();
			if(max>temp)
			{
				continue;
			}
			else
			{
				max=temp;
			}
		}
		System.out.println("maximum number:"+ max);

	}

}
