import java.util.*;

class AgeInvalid extends Exception
{
	public String name;

	public AgeInvalid(String name)
	{
		this.name=name;
	}
}

class Program29
{
	public static void main(String[] args) {
		
		int age=0;
		  java.util.Scanner obj = new java.util.Scanner(System.in);

		System.out.println("Enter Age :");
		age=obj.nextInt();

		try
		{


			if(age<18)
			{
				throw new AgeInvalid("Invalid Age ")
;			}
		}
		catch(Exception e)
		{
			System.out.println("Exceeption occured :"+e.toString());
		}

	}
}