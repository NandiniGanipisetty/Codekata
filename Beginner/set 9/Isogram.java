import java.util.Scanner;

public class Iso {

	public static void main(String[] args) {
		String str;
		int i,j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
		}
		if(count>0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}

	}

}
