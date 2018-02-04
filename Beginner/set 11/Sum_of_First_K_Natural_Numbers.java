import java.util.Scanner;

public class Natural_Numbers {

	public static void main(String[] args) {
		int K,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nuumber:");
		K=sc.nextInt();
		for(i=1;i<=K;i++)
		{
			sum+=i;
		}
		System.out.println("sum:"+sum);

	}

}
