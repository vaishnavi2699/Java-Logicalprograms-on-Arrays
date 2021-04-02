//Write a program to reverse the array.
package Logicalprograms;

import java.util.Scanner;                            // input: 23,45,67,89,23,78  output:78,23,89,67,45,23.   

public class Program2
{

	public static void main(String[] args)
	{
		int i=0,num=0;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=num-1;i>=0;i--)
		{
		   System.out.print(arr[i]+" ");
		}
	}

}
