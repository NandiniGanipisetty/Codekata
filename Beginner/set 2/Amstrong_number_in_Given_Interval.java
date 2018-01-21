import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int num,digit,temp,i,a,b,count=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the first interval:");
    	a=sc.nextInt();
    	System.out.println("enter the second interval:");
    	b=sc.nextInt();
    	System.out.println("amstrong numbers are:");
    	for(i=a+1;i<b;i++)
    	{
    	int c=i;
    	temp=0;
    	while(c!=0)
    	{
    		digit=c%10;
    		temp=(digit*digit*digit)+temp;
    		c/=10;
    	}
    	if(temp==i)
    	{
    		System.out.print(i+" ");
    		count++;
    	}
    	}
    	if(count==0)
    	{
    		System.out.println("no amstrong numbers between this intervals");
    		}

	}

}
