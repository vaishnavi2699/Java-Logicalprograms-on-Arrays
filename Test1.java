package project6;

import java.util.Scanner;

public class Test1
{
	public void atm()
	{
		int amt=0,a=0,b=0,c=0,d=0,e=0;           //2000,500,100,50,10;
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount to print number of notes: ");
		amt=s.nextInt();
	    if(amt%10==0)
	    {
	    	if(amt>=2000)
	    	{
	    		a=amt/2000;
	    		amt=amt-(a*2000);
	    		System.out.println("2000 rupees notes are: "+a);
	    	}
	    	if(amt>=500)
	    	{
	    		b=amt/500;
	    		amt=amt-(b*500);
	    		System.out.println("500 rupees notes are: "+b);
	    	}
	    	if(amt>=100)
	    	{
	    		c=amt/100;
	    		amt=amt-(c*100);
	    		System.out.println("100 rupees notes are: "+c);
	    	}
	    	if(amt>=500)
	    	{
	    		d=amt/50;
	    		amt=amt-(d*50);
	    		System.out.println("50 rupees notes are: "+d);
	    	}
	    	if(amt>=10)
	    	{
	    		e=amt/10;
	    		amt=amt-(e*10);
	    		System.out.println("10 rupees notes are: "+e);
	    	}
	    }
	    else
	    {
	    	System.out.println("Invalid amount");
	    	System.out.println("Enter valid amount");
	        amt=s.nextInt();
	        if(amt%10==0)
	 	    {
	 	    	if(amt>=2000)
	 	    	{
	 	    		a=amt/2000;
	 	    		amt=amt-(a*2000);
	 	    		System.out.println("2000 rupees notes are: "+a);
	 	    	}
	 	    	if(amt>=500)
	 	    	{
	 	    		b=amt/500;
	 	    		amt=amt-(b*500);
	 	    		System.out.println("500 rupees notes are: "+b);
	 	    	}
	 	    	if(amt>=100)
	 	    	{
	 	    		c=amt/100;
	 	    		amt=amt-(c*100);
	 	    		System.out.println("100 rupees notes are: "+c);
	 	    	}
	 	    	if(amt>=500)
	 	    	{
	 	    		d=amt/50;
	 	    		amt=amt-(d*50);
	 	    		System.out.println("50 rupees notes are: "+d);
	 	    	}
	 	    	if(amt>=10)
	 	    	{
	 	    		e=amt/10;
	 	    		amt=amt-(e*10);
	 	    		System.out.println("10 rupees notes are: "+e);
	 	    	}
	 	    	 System.out.println("Thank you for entering valid amount");
	 	    }
	    	 else
	    	 {
	    		 System.out.println("Invalid amount,try again later");
	    		 System.out.println("thank you");
	    	 }
	    }	
	}

	public static void main(String[] args)
	{
	 Test1 t=new Test1();
	 t.atm();
    }
}
