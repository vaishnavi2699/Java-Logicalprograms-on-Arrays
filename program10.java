//Write a java program to find kth largest element in an array.
package Logicalprograms;

import java.util.Scanner;

public class program10 
{
	public void des()
	{
		int num=0,i=0,j=0,temp=0;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("Enter "+num+" Values");
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Enter k value but k value should less than "+num);
		int k=s.nextInt();
		System.out.println(arr[k-1]);
	}
	public void asc()
	{
		int num=0,i=0,j=0,temp=0;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Enter k value but k value should less than "+num);
		int k=s.nextInt();
		System.out.println(arr[k-1]);
	}

	public static void main(String[] args) 
	{
		program10 d=new program10();
		int options;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter options to execute the program:1.des 2.asc ");
		options=s.nextInt();
		System.out.println("Executing the program"+options);
		switch(options)
		{
		case 1:
		{
			d.des();
			break;
		}
		case 2:
		{
			d.asc();
			break;
		}
		}
		

	}

}
