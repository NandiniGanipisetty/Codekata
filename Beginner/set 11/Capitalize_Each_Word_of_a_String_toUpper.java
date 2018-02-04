import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		String[] array=str.split(" ");
		String capital="";
		for(String w:array)
		{
			String first=w.substring(0, 1).toUpperCase();
			String last=w.substring(1);
			capital+=first+last+" ";
		}
		System.out.println(capital);

	}

}
