import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		int P,T,R,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements:");
		P=sc.nextInt();
		T=sc.nextInt();
		R=sc.nextInt();
		s=(P*T*R)/100;
		System.out.println("simple interest:"+s);

	}

}
