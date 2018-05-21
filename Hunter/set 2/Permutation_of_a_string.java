package permutation_of_a_string;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		String  S;
		Scanner sc=new Scanner(System.in);
		S=sc.nextLine();
		permutation("",S);

	}
	static void permutation(String permute,String input)
	{
		if(input.length()==0)
		{
			System.out.println(permute);
		}
		else
		{
			for(int i=0;i<input.length();i++)
			{
				permutation(permute+input.charAt(i),input.substring(0, i)+input.substring(i+1,input.length()));
			}
		}
	}

}
