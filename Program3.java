// Find the occurrence of an integer in the array.
package Logicalprograms;

import java.util.Scanner;

public class Program3 
{

	public static void main(String[] args) 
	{
		int i=0,j=0,num=0,count=1;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");                    //24,56,78,12,12.
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
				 count++;	
				}
			}
			if(count==2)
			{
				System.out.println("occurance of integer is: "+arr[j]);
			}
			
		}
		for(i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
