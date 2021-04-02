// Find the Kth largest and Kth smallest number in an array.
package Logicalprograms;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		 int temp=0,i=0,j=0,size=0;
	    size=s.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter array values: ");
		for(i=0;i<size;i++)
        {
        	arr[i]=s.nextInt();
        }
        for(i=0;i<size;i++)
        {
        	for(j=i+1;j<size;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        		
        		
        	}
        }
        System.out.println("Enter k value but k value should less than  "+size);
        int k=s.nextInt();
        System.out.println("ascending value is: "+arr[k-1]);
       
	}

}
