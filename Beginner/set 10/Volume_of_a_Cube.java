import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		int L,B,H,V;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		L=sc.nextInt();
		System.out.println("enter the width:");
		B=sc.nextInt();
		System.out.println("enter the heigth:");
		H=sc.nextInt();
		V=L*B*H;
		System.out.println("volume of a cube:"+V);

	}

}
