package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String s,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		s=sc.nextLine();
		String[] array=s.split(" ");
		for(String w:array)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverse+=sb.toString()+" ";
		}
		System.out.println(reverse);

	}

}
