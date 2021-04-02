package project6;

import java.util.Scanner;

public class Test6 
{

	public static void main(String[] args) 
	{
		int num,count=1,i=1,j=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number: ");
        num=s.nextInt();
        for(i=1;i<=num;i++)
        {
        	for(j=1;j<=i;j++)
        	{
        		if(i%j==0)
        		{
        			count++;
        		}
        	}
        	if(count==2)
        	{
        		System.out.println(i+" ");
        	}
        	count=0;
        }

	}

}
