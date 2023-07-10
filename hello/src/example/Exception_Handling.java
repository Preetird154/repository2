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
			System.out.println("Division: "+res);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("cannot be divided");
		}
		
		
		//Arrays
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		//System.out.println("enter the array elements");
		try
		{
			System.out.println("enter the array elements");
			int arr[] =new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("The array elements are: ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("exception handled for arrays");
		}
		
		catch(Exception e)
		{
			System.out.println("change the code, there is some error");
		}
	}

}
