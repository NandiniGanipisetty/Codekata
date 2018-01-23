import java.util.Scanner;

public class Count_Char {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		str=str.replaceAll(" ", "");
		System.out.println("number of characters:");
		System.out.println(str.length());

	}

}
