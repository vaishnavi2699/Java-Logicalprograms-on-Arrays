package Logicalprograms;

import java.util.Scanner;

public class Program8 
{

	public static void main(String[] args) 
	{
		  int num=0,i=0,j=0,count=0;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter array size: ");
		 num=s.nextInt();
		 int arr[]=new int[num];
	     System.out.println("Enter"  +num+  "values");
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
        			count=arr[i];
        		    break;
        		}
        	}
        }
        if(count!=0)
        {
        	System.out.println("Reapeting element is: ");
        	System.out.println(count);
        }
	}

}
