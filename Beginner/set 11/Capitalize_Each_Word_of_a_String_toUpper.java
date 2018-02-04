import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		String str,capital="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		String[] array=str.split(" ");
		for(int i=0;i<array.length;i++)
		{
			capital=capital+array[i].substring(0, 1).toUpperCase()+array[i].substring(1)+" ";
		
		}
		System.out.println(capital);

	}

}
