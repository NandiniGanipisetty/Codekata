package remove_all_space;

import java.util.Scanner;

public class Remove_Space {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		s=sc.nextLine();
		System.out.println(s.replaceAll(" ", ""));

	}

}
