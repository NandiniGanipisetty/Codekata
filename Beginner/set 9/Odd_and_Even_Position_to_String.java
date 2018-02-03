import java.util.Scanner;

public class Odd_and_Even {

	public static void main(String[] args) {
		String str;
		String str1="";
		String str2="";
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i+=2)
		{
			str1+=array[i];
		}
		System.out.print(str1+" ");
		for(j=1;j<str.length();j+=2)
		{
			str2+=array[j];
		}
		System.out.print(str2);

	}

}
