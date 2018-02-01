import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		String array[]= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		N=sc.nextInt();
		System.out.println(array[N]);
	}

}
