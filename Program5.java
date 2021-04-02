//Move all the negative elements to one side of the array.
        //  Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
         //Output: -12 -13 -5 -7 -3 -6 11 6 5
package Logicalprograms;

import java.util.Scanner;

public class Program5 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[100];
		int result[]=new int[100];
		int num=0,x=0;
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(arr[i]<0)
			{
				result[x]=arr[i];
				x++;
			}
		}
		for(int i=0;i<num;i++)
		{
			if(arr[i]>0)
			{
				result[x]=arr[i];
				x++;
			}
		}
		for(int i=0;i<num;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

}
