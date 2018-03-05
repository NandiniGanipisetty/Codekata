package sine_of_an_given_angle;

import java.util.Scanner;

public class Sine_Angle {

	public static void main(String[] args) {
		int A;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the angle:");
		A=sc.nextInt();
		System.out.println(Math.sin(Math.toRadians(A)));

	}

}
