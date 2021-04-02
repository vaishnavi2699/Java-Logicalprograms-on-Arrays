// Write a program to sort the given array.
package Logicalprograms;

import java.util.Scanner;

public class Program4 
{
   public void asc()
   {
	   int i=0,j=0,num=0,temp=0;
	   int arr[]=new int[100];
	   Scanner s=new Scanner(System.in);
	   System.out.println("How many values do you want to enter: ");
	   num=s.nextInt();
	   for(i=0;i<num;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   System.out.println("Ascending order is: ");
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
	   for(i=0;i<num;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   
   }
   public void des()
   {
	   int i=0,j=0,num=0,temp=0;
	   int arr[]=new int[100];
	   Scanner s=new Scanner(System.in);
	   System.out.println("How many values do you want to enter: ");
	   num=s.nextInt();
	   for(i=0;i<num;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   System.out.println("descending order is: ");
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
	   for(i=0;i<num;i++)
	   {
		   System.out.println(arr[i]);
	   } 
   }
	public static void main(String[] args) 
	{
		Program4 p=new Program4();
		int options;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter options to execute the program:1.asc 2.des ");
		options=s.nextInt();
		switch(options)
		{
		case 1:
		{
			p.asc();
			break;
		}
		case 2:
		{
			p.des();
			break;
		}
		default:
		{
			System.out.println("Invalid Option");
		}
		}
		
	}

}
