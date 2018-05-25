package after_delete_palindrome_or_not;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String S;
		Scanner sc=new Scanner(System.in);
		S=sc.nextLine();
		String s1;
		s1=S;
		if(removeChar(s1))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	static boolean removeChar(String s)
	{
		String str="";
		for(int i=0;i<s.length();i++)
		{
			str=s.substring(0, i)+s.substring(i+1);
			String s1=palindrome(str);
			if(str.equals(s1))
			{
				return true;
			}
		}
		return false;
	}
	static String palindrome(String str)
	{
		String s1=str;
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		return sb.toString();
	}

}
