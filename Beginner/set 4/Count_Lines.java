import java.util.Scanner;

public class Line_Count {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		String[] array=str.split(str, '.');
		System.out.println("no of lines:"+array.length);

	}

}
