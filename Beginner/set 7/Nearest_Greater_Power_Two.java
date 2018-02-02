import java.util.Scanner;

public class Power_of_Two {

	public static void main(String[] args) {
		int N,result=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		while(result<N)
		{
			result=1<<k;
			k++;
		}
		System.out.println(result);
	
	}

}
