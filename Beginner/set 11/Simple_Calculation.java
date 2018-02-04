import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		System.out.println("output:"+(A*B)/C);

	}

}
