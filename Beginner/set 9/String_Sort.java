import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		Arrays.sort(array);
		System.out.println(array);

	}

}
