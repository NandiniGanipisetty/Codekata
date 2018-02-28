package remove_vowel_and_reverse_string;

import java.util.Scanner;

public class Remove_Vowel {

	public static void main(String[] args) {
		String S;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		String str=S.replaceAll("[aeiouAEIOU]","");
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());

	}

}
