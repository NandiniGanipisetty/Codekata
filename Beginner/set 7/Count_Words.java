import java.util.Scanner;

public class Count_words {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		String[] array=str.split(" ");
		System.out.println("no of words:");
		System.out.println(array.length);

	}

}
