// Find the minimum and maximum element in an array?
package Logicalprograms;
import java.util.Scanner;
public class Program1 
{
	public void m1()
	{
		int i=0,num=0,max=0,min=0;
		int arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you enter: ");
		num=s.nextInt();
		min=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum value is: "+max);
		System.out.println("Minimum value is: "+min);
	}
	

	public static void main(String[] args) 
	{
		Program1 p=new Program1();
		p.m1();
		

	}

}
