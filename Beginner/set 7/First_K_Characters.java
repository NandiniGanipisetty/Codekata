import java.util.Scanner;

public class K_char {

	public static void main(String[] args) {
		String str;
		int K;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		System.out.println("enter the number:");
		K=sc.nextInt();
		System.out.println(str.substring(0, K));

	}

}
