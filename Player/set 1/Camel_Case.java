package camel_case;

import java.util.Scanner;

public class Camel {

	public static void main(String[] args) {
		String S;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		String[] array=S.split(" ");
		String str="";
		for(i=0;i<array.length;i++)
		{
			str=str+array[i].substring(0, 1).toUpperCase()+array[i].substring(1)+" ";
		}
		System.out.println(str);

	}

}
