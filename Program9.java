package Logicalprograms;

import java.util.Scanner;

public class Program9 
{

	public static void main(String[] args) 
	{
		int i=0,j=0,num=0;
		int arr1[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("enter array values: ");
		for(i=0;i<num;i++)
		{
			arr1[i]=s.nextInt();
		}
		int arr2[]=new int[100];
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("enter array values: ");
		for(i=0;i<num;i++)
		{
			arr2[i]=s.nextInt();
		}
		System.out.println("Intersection is: ");
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		System.out.println("Union is: ");
		for(i=0;i<num;i++)
		{
			System.out.print(arr1[i]+",");
		}
		for(i=0;i<num;i++)
		{
			System.out.print(arr2[i]+",");
		}

	}

}
