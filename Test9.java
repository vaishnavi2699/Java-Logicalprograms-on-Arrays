package project6;

import java.util.Scanner;

public class Test9 
{

	public static void main(String[] args)
	{
		int i=1,num=0,evensum=0,oddsum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check sum of even and odd digits: ");
		num=s.nextInt();
		while(i<=num)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else if(i%2!=0)
			{
				oddsum=oddsum+i;
			}
			i++;
		}
		System.out.println("even sum is: "+evensum);
		System.out.println( "odd sum is: "+oddsum);
		

	}

}
