import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		str=str.toUpperCase();
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		System.out.println(str.charAt(N-1));

	}

}
