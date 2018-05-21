package kth_closest_element;

import java.util.Scanner;

public class Kth_Closest_Element {

	public static void main(String[] args) {
		int N,K,i,C;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		C=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		ClosestElement(array,C,array.length,K);

	}
	static void ClosestElement(int[] arr,int x,int len,int n)
	{
		int left=SearchElement(arr,0,arr.length-1,x);
		int right=left+1;
		int count=0;
		if(arr[left]==x)
		{
			left--;
		}
		while(left>=0&&right<=len&&count<n)
		{
			if(x-arr[left]<arr[right]-x)
			{
				System.out.println(arr[left]);
				left--;
			}
			else
			{
				System.out.println(arr[right]);
				right++;
			}
			count++;
		}
		while(left>=0&&count<n)
		{
			System.out.println(arr[left]);
			left--;
			count++;
		}
		while(right<=n&&count<n)
		{
			System.out.println(arr[right]);
			right++;
			count++;
		}
	}
	static int SearchElement(int[] arr,int left,int right,int find)
	{
		int mid=left+(right-left)/2;
		if(arr[mid]==find)
		{
			return mid;
		}
		else if(arr[mid]>find)
		{
			return SearchElement(arr,left,mid-1,find);
		}
		else
		{
			return SearchElement(arr,mid+1,right,find);
		}
	}

}
