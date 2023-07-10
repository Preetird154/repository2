package example;

import java.util.Scanner;
public class Exception_Handling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		int res;
		try
		{
			res=n1/n2;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("cannot be divided");
		}
		
		//Arrays
		
		System.out.println("enter the size of array");
		
	}

}
