package count_word_occur;

import java.util.Scanner;

public class Count_Word {

	public static void main(String[] args) {
		String str,S;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence and string:");
		str=sc.nextLine();
		S=sc.nextLine();
		String[] array=str.split(" ");
		for(i=0;i<array.length;i++)
		{
			if(array[i].equals(S))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
