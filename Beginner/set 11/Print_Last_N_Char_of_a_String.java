import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		String str;
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string and number:");
		str=sc.nextLine();
		N=sc.nextInt();
		System.out.println(str.charAt(str.length()-N));

	}

}
