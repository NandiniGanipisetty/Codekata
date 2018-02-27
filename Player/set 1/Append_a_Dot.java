package append_a_dot;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		String S;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		StringBuilder sb=new StringBuilder(S);
		sb.append('.');
		System.out.println(sb);

	}

}
