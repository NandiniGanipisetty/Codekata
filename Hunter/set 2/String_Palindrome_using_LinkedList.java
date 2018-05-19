package string_linkedlist;

import java.util.Scanner;
class node
{
	char data;
	node next;
	node(char a)
	{
		data=a;
		next=null;
	}
}
public class String_LS {
	static node head,temp;
	static String S;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		S=sc.nextLine();
		char[] array=S.toCharArray();
		int x=S.length();
		head=new node(array[0]);
		while(x!=0)
		{
			create(array);
			x--;
		}
		node rev=reverse(head);
		int pal=palindrome(head,rev);
		System.out.println(pal);
		if(pal==array.length)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		//display(head);

	}
	static void create(char[] array)
	{
		node newnode;
		int i;
		temp=head;
		for(i=1;i<S.length();i++)
		{
			newnode=new node(array[i]);
			temp.next=newnode;
			temp=newnode;
		}
	}
	static int palindrome(node s1,node s2)
	{
		int count=0;
		while(s1!=null)
		{
			if(s1.data==s2.data)
			{
				count++;
			}
			s1=s1.next;
			s2=s2.next;
		}
		return count;
	}
	static node reverse(node temp1)
	{
		node rev=new node(temp1.data);
		node temp2=temp1.next;
		while(temp2!=null)
		{
			node te=new node(temp2.data);
			te.next=rev;
			rev=te;
			temp2=temp2.next;
		}
		return rev;
	}
	static void display(node temp1) {
		while(temp1!=null)
		{
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
	}

}
