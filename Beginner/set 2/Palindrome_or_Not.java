package sentense_case;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int num,reversed=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        num=sc.nextInt();
        int temp=num;
        while(num != 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num =num/ 10;
        }
        if(temp==reversed)
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("not a Palindrome");
        }
    }
}
