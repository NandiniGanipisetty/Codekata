package double_string;

import java.util.Scanner;

public class DoubleString {

	public static void main(String[] args) {
		String S;
		Scanner sc=new Scanner(System.in);
		S=sc.nextLine();
		if(deleteChar(S))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	static boolean deleteChar(String str)
	{
		int i;
		for(i=0;i<str.length();i++)
		{
			String s=str.substring(0, i)+str.substring(i+1);
			if(doubleString(s))
			{
				return true;
			}
		}
		return false;
	}
	static boolean doubleString(String str)
	{
		int i,n=str.length()/2;
		for(i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)==str.charAt(n))
			{
				return true;
			}
			n++;
		}
		return false;
	}
}
