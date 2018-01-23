import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		String str;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("number of numeric characters:"+count);
	}

}
