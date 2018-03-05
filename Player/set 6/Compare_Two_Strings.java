package compare_two_strings;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String str1;
		java.lang.String str2;
		int count=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings:");
		str1=sc.nextLine();
		str2=sc.nextLine();
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		if(array1.length==array2.length)
		{
			for(i=0;i<array1.length;i++)
			{
				if(array1[i]==array2[i])
				{
					count++;
				}
			}
			if(count==array1.length)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
