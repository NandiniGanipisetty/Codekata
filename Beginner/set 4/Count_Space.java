import java.util.Scanner;

public class Space_Count {

	public static void main(String[] args) {
		String str;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("no of space:"+count);

	}

}
