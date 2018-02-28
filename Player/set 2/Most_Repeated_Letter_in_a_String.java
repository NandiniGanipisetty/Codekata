package most_repeated_letter;

import java.util.Scanner;

public class Repeated {

	public static void main(String[] args) {
		String S;
		int i,j,temp = 0,max=0,count;
		char maxoccur = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		char[] array=S.toCharArray();
		for(i=0;i<S.length();i++)
		{
			count=0;
			for(j=i+1;j<S.length();j++)
			{
				if(array[i]==array[j])
				{
					count++;
					temp=count;
				}
			}
			if(temp>max)
			{
				max=temp;
				maxoccur=array[i];
			}
		}
		System.out.println(maxoccur);

	}

}
