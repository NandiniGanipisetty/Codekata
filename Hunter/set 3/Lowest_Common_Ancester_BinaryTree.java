package lca_binary_tree;

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
public class LowestCommonncester {
	static node root;
	static ArrayList<Integer>path1=new ArrayList<Integer>();
	static ArrayList<Integer>path2=new ArrayList<Integer>();

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int rootnode=sc.nextInt();
		root=new node(rootnode);
		while(N!=1)
		{
			int x;
			x=sc.nextInt();
			createTree(root,x);
			N--;
		}
		int n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		int common=commonAncester(root,n1,n2);
		if(common!=-1)
		{
			System.out.println(common);
		}
		//preorder(root);

	}
	static void createTree(node temp,int x)
	{
		node newnode=new node(x);
			if(temp.left!=null && temp.data>=x)
			{
				createTree(temp.left,x);
			}
			else if(temp.right!=null &&temp.data<=x)
			{
				createTree(temp.right,x);
			}
			if(temp.left==null&&temp.data>=x)
			{
				temp.left=newnode;
			}
			else if(temp.right==null&&temp.data<=x)
			{
				temp.right=newnode;
			}
	}
	static int commonAncester(node root,int n1,int n2)
	{
		if(!findNode(root,path1,n1)||!findNode(root,path2,n2))
		{
			System.out.println("node missing");
		}
		int i;
		for(i=0;i<path1.size()&&i<path2.size();i++)
		{
			if(!path1.get(i).equals(path2.get(i)))
			{
				break;
			}
		}
		return path1.get(i-1);
	}
	static boolean findNode(node root,ArrayList<Integer>list,int x)
	{
		if(root==null)
		{
			return false;
		}
		list.add(root.data);
		if(root.data==x)
		{
			return true;
		}
		if(root.left!=null&&findNode(root.left,list,x))
		{
			return true;
		}
		if(root.right!=null&&findNode(root.right,list,x))
		{
			return true;
		}
		list.remove(list.size()-1);
		return false;
	}
	static void preorder(node temp)
	{
		if(temp==null)
		{
			return;
		}
		System.out.print(temp.data+" ");
		preorder(temp.left);
		preorder(temp.right);
	}

}
