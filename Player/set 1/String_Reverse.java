package string_reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String S;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		StringBuilder sb=new StringBuilder(S);
		System.out.println(sb.reverse());
	}

}
