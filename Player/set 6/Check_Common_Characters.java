package check_common_characters;

import java.util.Scanner;

public class Common_Char {

	public static void main(String[] args) {
		String str1,str2;
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings:");
		str1=sc.nextLine();
		str2=sc.nextLine();
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		for(i=0;i<str1.length();i++)
		{
			if(array1[i]==array2[i])
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
