import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		String str;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		a=str.length()/2;
		char[] array=str.toCharArray();
		if(str.length()%2==0)
		{
		array[a-1]='*';
		array[a]='*';
		System.out.println(array);
		}
		else
		{
		array[a]='*';
		System.out.println(array);
		}

	}

}
