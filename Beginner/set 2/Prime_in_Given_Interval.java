import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int a,b,i,j,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first intervel:");
		a=sc.nextInt();
		System.out.println("enter the second intervel:");
		b=sc.nextInt();
		System.out.println("prime numbers:");
		for(i=a+1; i<b; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
		

	}

}
