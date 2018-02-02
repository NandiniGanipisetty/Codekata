import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		String str;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		str=str.toLowerCase();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}

	}

}
