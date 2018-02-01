import java.util.Scanner;

public class Swap_Numbers {

	public static void main(String[] args) {
		int a ,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("swapped numbers:"+ a+" "+b);

	}

}
