import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int l,r,i,j,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first intervel:");
		l=sc.nextInt();
		System.out.println("enter the second intervel:");
		r=sc.nextInt();
		System.out.println("prime numbers:");
		for(i=l+1; i<r; i++)
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
