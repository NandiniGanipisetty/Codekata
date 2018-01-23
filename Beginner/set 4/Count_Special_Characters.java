import java.util.Scanner;

public class Count_Special_char {
	public static void fun(String special)
	{
		String str;
		int i,j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<special.length();j++)
			{
				if(str.charAt(i)==special.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println("no of special characters:"+count);
	}

	public static void main(String[] args) {
		fun(" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
		

	}

}
