import java.util.Scanner;

public class Tempearture_Conversion {

	public static void main(String[] args) {
		int C;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the celsius:");
		C=sc.nextInt();
		int K=C+273;
		System.out.println("temperature:"+K);
		

	}

}
