import java.util.Scanner;

public class High_and_Low {

	public static void main(String[] args) {
	int N,i,max,min;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	N=sc.nextInt();
	int[] array=new int[N];
	System.out.println("enter the array elements:");
	for(i=0;i<N;i++)
	{
		array[i]=sc.nextInt();
	}
	max=array[0];
	min=array[0];
	for(i=0;i<N;i++)
	{
		if(array[i]>max)
		{
			max=array[i];
		}
		else if(array[i]<min)
		{
			min=array[i];
		}
	}
	System.out.println("highest number:"+max+" "+"lowest number:"+min);

	}

}
