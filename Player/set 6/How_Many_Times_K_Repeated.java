package find_postion_of_k;

import java.util.Scanner;

public class Char_Position {

	public static void main(String[] args) {
		String str;
		char K;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string and char:");
		str=sc.nextLine();
		K=sc.next().charAt(0);
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]==K)
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
