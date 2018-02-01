import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		String array=String.valueOf(N);
		for(int i=0;i<array.length();i++)
		{
			System.out.print(array.charAt(i)+" ");
		}
	}

}
