package add_3_with_each_character;

import java.util.Scanner;

public class Add_Three {

	public static void main(String[] args) {
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]=='x'||array[i]=='y'||array[i]=='z'||array[i]=='X'||array[i]=='Y'||array[i]=='Z')
			{
				array[i]=(char) (array[i]-23);
			}
			else
			{
			array[i]=(char) (array[i]+3);
			}
		}
		System.out.println(array);

	}

}
