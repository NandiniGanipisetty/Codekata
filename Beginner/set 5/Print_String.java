import java.util.Scanner;

public class String_Print {

	public static void main(String[] args) {
	String str;
	int K,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	str=sc.nextLine();
	System.out.println("enter k:");
	K=sc.nextInt();
	for(i=0;i<K;i++)
	{
		System.out.println(str);
	}

	}

}
