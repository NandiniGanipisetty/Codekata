import java.util.ArrayList;
import java.util.Scanner;

public class Mains
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int i,j,k;
		ArrayList<String> list=new ArrayList<>();
		char[] array=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			for(j=i;j<s.length();j++)
			{
				String S="";
				for(k=i;k<=j;k++)
				{
					S+=array[k];
				}list.add(S);
			}
		}int max=0;
		for(i=0;i<list.size();i++)
		{
			int count=1,x=list.get(i).indexOf('a');
			if(x==0)
			{
				for(j=x+1;j<list.get(i).length();j++)
				{
					count++;
					if(list.get(i).charAt(j)==list.get(i).charAt(j-1))
					{
						break;
					}
				}
			}
			if(count>max)
			{
				max=count;
			}
		}System.out.println(max);
	}
}
