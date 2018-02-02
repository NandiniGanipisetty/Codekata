import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		String S;
		int i,count=0,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		int num=Integer.parseInt(S);
		len=S.length();
		for(i=0;i<S.length();i++)
		{
			if(num%10==0||num%10==1)
			{
				count++;
			}
		}
		if(count==len)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
