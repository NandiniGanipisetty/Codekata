package substring_of_first_string;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings:");
		str1=sc.nextLine();
		str2=sc.nextLine();
		if(str1.contains(str2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
