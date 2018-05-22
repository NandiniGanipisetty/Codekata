package numberappear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_Number_Appear {

	public static void main(String[] args) {
		int N,K,i,j;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		int[][] array=new int[N][K];
		for(i=0;i<N;i++)
		{
			for(j=0;j<K;j++)
			{
			array[i][j]=sc.nextInt();
			}
		}
		int num=SameNumber(array,N,K);
		

	}
	static int SameNumber(int[][] arr,int row,int col)
	{
		int i,j,k;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(j=0;j<arr[0].length;j++)
		{
			hm.put(arr[0][j],1);
		}
		for(i=1;i<row;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				if(hm.containsKey(arr[i][j])) {
					int v=hm.get(arr[i][j]);
					hm.put(arr[i][j],++v);
				}
			}
		}
		for(Map.Entry m:hm.entrySet()) {
		int ke=(int)m.getKey();
		int v=(int)m.getValue();
		if(v==row) {
			System.out.print(ke+" ");
		}
		}
		return 0;
	}

}
