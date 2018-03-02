package print_every_third_character;

import java.util.Scanner;

public class Third_Character {

	public static void main(String[] args) {
		String S;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		for(i=0;i<S.length();i+=3)
		{
			System.out.print(S.charAt(i));
		}

	}

}
