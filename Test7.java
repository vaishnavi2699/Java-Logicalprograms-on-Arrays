package project6;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args)
	{
		int num=0,rem=0,sum=0,fact=1,temp=1,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check strong number or not");
        num=s.nextInt();
        temp=num;
        	 while(num!=0)
             {
             	rem=num%10;
             	while(rem>=1)
             	{
             		fact=fact*rem;
             		rem--;
             	}
             	sum=sum+fact;
             	fact=1;
             	num=num/10;
             }
             if(sum==temp)
             {
             	System.out.println("strong number");
             }
             else
             {
             	System.out.println("not a strong number");
             }
     	
	}
       
}
