package case_change;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]>=65&&array[i]<=90)
			{
				array[i]=(char) (array[i]+32);
			}
			else if(array[i]>=97&&array[i]<=122)
			{
				array[i]=(char) (array[i]-32);
			}
		}
		System.out.println(array);

	}

}
