 // Find the Union and Intersection of the two sorted arrays.
package Logicalprograms;

import java.util.Scanner;

public class Program6 
{

	public static void main(String[] args)
	{
	  int arr1[]=new int[100];
	  int i=0,j=0,num=0,temp=0;
	  Scanner s=new Scanner(System.in);
	  System.out.println("How many values do you want to enter: ");
	  num=s.nextInt();
	  for(i=0;i<num;i++)
	  {
		  arr1[i]=s.nextInt();
	  }
	  int arr2[]=new int[100];
	  System.out.println("How many values do you want to enter: ");
	  num=s.nextInt();
	  for(i=0;i<num;i++)
	  {
		  arr2[i]=s.nextInt();
	      if(arr1[i]==arr2[j])
	      {
	    	  System.out.println(arr1[i]);
	      }
	   }
	  for(i=0;i<num;i++)
	  {
		  System.out.println(arr2[i]);
	  }
	}

}
