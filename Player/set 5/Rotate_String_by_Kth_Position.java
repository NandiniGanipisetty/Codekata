package rotate_a_string_by_k_times;

import java.util.Scanner;

public class Rotate_a_String {

	public static void main(String[] args) {
		String S;
		int K,i,j;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		K=sc.nextInt();
		char[] array=S.toCharArray();
		for(i=0;i<K;i++)
		{
			temp=array[0];
			array[0]=array[S.length()-1];
			for(j=S.length();j>1;j--)
			{
				array[j-1]=array[j-2];
			}
			array[j]=temp;
		}
		System.out.println(array);

	}

}
