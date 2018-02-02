
public class Palindrome {
	static void fun(String str1)
	{
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		String str2=sb.toString();
		if(str2.equals(str1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		fun("lappal");

	}

}
