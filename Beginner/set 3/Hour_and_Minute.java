import java.util.Scanner;

public class Hour_and_Minutes {

	public static void main(String[] args) {
		int min,hour=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter minute:");
		min=sc.nextInt();
		if(min>=60)
		{
			hour=min/60;
			min=min%60;
		}
		System.out.println("hour:"+hour+" "+"minute:"+min);

	}

}
