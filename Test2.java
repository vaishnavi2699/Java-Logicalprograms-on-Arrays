package project6;

import java.util.Scanner;

public class Test2 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Ascii values of char's");
		 int a=s.nextInt();
		 char ch=(char)a;
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lower case letters");
		}
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper  case letters");
		}
		else if(ch>=0 && ch<=9)
		{
			System.out.println("Digits");
		}
		else
		{
			System.out.println("special character");
		}
		
		

	}

}
