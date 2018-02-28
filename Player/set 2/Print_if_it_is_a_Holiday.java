package print_holiday;

import java.util.Scanner;

public class Holiday {

	public static void main(String[] args) {
		String S;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day:");
		S=sc.nextLine();
		S=S.toLowerCase();
		switch(S)
		{
		case "monday":
			System.out.println("no");
			break;
		case "tuesday":
			System.out.println("no");
			break;
		case "wednesday":
			System.out.println("no");
			break;
		case "thursday":
			System.out.println("no");
			break;
		case "friday":
			System.out.println("no");
			break;
		case "saturday":
			System.out.println("yes");
			break;
		case "sunday":
			System.out.println("yes");
			break;
		default:
			System.out.println("no such day");
			break;
			
		}

	}

}
