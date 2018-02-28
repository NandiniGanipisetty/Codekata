package anagram_of_kabali;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		int N,i,count=0;
		String s="kabali";
		char[] str1=s.toCharArray();
		Arrays.sort(str1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		N=sc.nextInt();
		String[] array=new String[N];
		for(i=0;i<N;i++)
		{
			array[i]=sc.next();
		}
		for(i=0;i<N;i++)
		{
			char[] str2=array[i].toCharArray();
			Arrays.sort(str2);
			if(Arrays.equals(str1, str2))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
