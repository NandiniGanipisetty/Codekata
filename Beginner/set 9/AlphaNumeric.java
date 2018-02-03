import java.util.Scanner;

public class Numeric {

	public static void main(String[] args) {
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]>=48&&array[i]<=57)
			{
				System.out.print(array[i]);
			}
		}

	}

}
