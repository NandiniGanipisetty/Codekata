package string_length_without_using_length_method;

import java.util.Scanner;

public class String_Length {

	public static void main(String[] args) {
		String S;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		for(char ch:S.toCharArray())
		{
			count++;
		}
		System.out.println(count);

	}

}
