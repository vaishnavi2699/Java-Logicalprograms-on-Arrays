package project6;

public class try1 
{

	public static void main(String[] args)
	{
		try
		{
			int i,sum;
			sum=10;
			for(i=-1;i<3;i++)
			{
				sum=(sum/i);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println("0");
		}

	}

}
