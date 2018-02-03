import java.util.Scanner;

public class Mod {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		c=(a*b)%c;
		System.out.println(c);

	}

}
