package ancester;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

class node
{
	int data;
	node left,right;
	node(int a)
	{
		data=a;
		left=null;
		right=null;
	}
}
public class Lowest_Common_Ancester {

	static node root;
	static ArrayList<Integer>path1=new ArrayList<Integer>();
	static ArrayList<Integer>path2=new ArrayList<Integer>();
	public static void main(String[] args) {
		root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int common=commonNode(root,n1,n2);
		if(common!=-1)
		{
			System.out.println(common);
		}

	}
	static int commonNode(node root,int n1,int n2)
	{
		if(checkNode(n1,n2))
		{
		int i,len=0;
		if(path1.size()>path2.size())
		{
			len=path2.size();
		}
		else
		{
			len=path1.size();
		}
		for(i=0;i<len;i++)
		{
			if(!path1.get(i).equals(path2.get(i)))
			{
				break;
			}
		}
		return path1.get(i-1);
		}
		else
		{
			return -1;
		}
	}
	static boolean findPath(node root,ArrayList<Integer>path,int x)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==x)
		{
			return true;
		}
		path.add(root.data);
		if(root.left!=null&&findPath(root.left,path,x))
		{
			return true;
		}
		if(root.right!=null&&findPath(root.right,path,x))
		{
			return true;
		}
		path.remove(path.size()-1);
		return false;
	}
	static boolean checkNode(int n1,int n2)
	{
		if(findPath(root,path1,n1))
		{
			System.out.println("n1 is present");
		}
		else
		{
			return false;
		}
		if(findPath(root,path2,n2))
		{
			System.out.println("n2 is presset");
		}
		else
		{
			return false;
		}
		return true;
	}

}
