package project6;

import java.util.Scanner;

public class Test8
{

	public static void main(String[] args) 
	{
		int i=1,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n number: ");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			else if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}
		
		

	}

}
