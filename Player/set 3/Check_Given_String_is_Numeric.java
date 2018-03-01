package check_string_is_numeric;

import java.util.Scanner;

public class Check_Numeric {

	public static void main(String[] args) {
		String str;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]>=48&&array[i]<=57)
			{
				count++;
			}
		}
		if(count==str.length())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
