package project6;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Ascii values of alphabets");
		 int a=s.nextInt();
		 char ch=(char)a;
		 if(ch==a || ch==e || ch==i || ch==o || ch==u)
		 {
			System.out.println("vowels"); 
		 }
		 else
		 {
			 System.out.println("consonents");
		 }

	}

}
