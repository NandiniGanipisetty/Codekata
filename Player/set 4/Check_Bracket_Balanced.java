package check_bracket_balance;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		String S;
		int j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		char[] array=S.toCharArray();
	     if(array[S.length()-1]=='(')
			{
				System.out.println("no");
			}
			else
			{
				for(j=0;j<S.length();j++)
				{
					if(array[j]==')')
					{
						count++;
					}
					if(array[j]=='(')
					{
						count--;
					}
				}
				if(count==0)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
		

	}

}
