package max_length;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		String N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextLine();
		if(N.length()>=1&&N.length()<=1000)
		{
			System.out.println(longestPalindrome(N));
		}
	}
	static String longestPalindrome(String str)
	{
		String s=str,S=null;
		int max=0;
		for(int i=0;i<=s.length();i++)
		{
			int len=s.substring(0,i).length();
			if(isPalindrome(s.substring(0, i)))
			{
				if(max<len)
				{
					max=len;
					S=s.substring(0,i);
				}
			}
		}
		return S;
	}
	static boolean isPalindrome(String str)
	{
		String rev=str;
		StringBuilder sb=new StringBuilder(rev);
		sb.reverse();
		if(!(str.compareTo(sb.toString())==0))
		{
			return true;
		}
		return false;
	}

}
