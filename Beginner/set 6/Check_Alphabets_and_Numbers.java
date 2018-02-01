import java.util.Scanner;

public class Char_and_Digit {

	public static void main(String[] args) {
		String str;
		int i,digit=0,ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				digit++;
			}
			if(Character.isAlphabetic(str.charAt(i)))
			{
				ch++;
			}
		}
		if(digit>=1&&ch>=1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
