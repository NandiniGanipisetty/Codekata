package maximum_char_occur;

import java.util.Scanner;

public class Repeated_Char {

	public static void main(String[] args) {
		String str;
		int i,j,z,count=0,max=0;
		char ch = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		String[] array=str.split(" ");
		for(i=0;i<array.length;i++)
		{
			char[] arr=array[i].toCharArray();
			for(j=0;j<arr.length;j++)
			{
				for(z=j+1;z<arr.length;z++)
				{
				if(arr[j]==arr[z])
				{
					count++;
				}
				if(count>max)
				{
					max=count;
					ch=arr[j];
				}
				count=0;
				max=0;
			    }
			}
			System.out.print(ch+" ");
		}

	}

}
