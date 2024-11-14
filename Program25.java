
import java.util.*;



abstract class ArrayX
{
	public int Arr[];
	public int ipos;
	public int isize=0;

	public ArrayX(int i)
	{
		this.isize=i;
		this.ipos=0;
		this.Arr=new int[i];
	}

	public void display()
	{
		for(int i=0;i<Arr.length;i++)
		{

			System.out.println(Arr[i]);	
		}
	}

	public void add(int iNo)
	{
		if(ipos!=isize)
		{
			this.Arr[ipos]=iNo;
			this.ipos++;
		}
		else
		{
			System.out.println("Array is Full");
		}
		
	}

	abstract public void evenOrOdd();
}

class Demo extends ArrayX
{
	public Demo(int size)
	{
		super(size);
	}

	public void evenOrOdd()
	{
		System.out.println("Method Override");
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2!=0)
			{
				System.out.println("The Element is Odd at index "+i +" and the Element is :"+Arr[i]);
			}
			else {
				System.out.println("The Element is Even at index "+i +" and the Element is :"+Arr[i]);
			}
		}
	}

}

class Program25
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int size=sobj.nextInt();
		Demo dobj=new Demo(size);
		int iChoice=0;
		int iElement=0;
		boolean iret=true;
		
		try
		{

			while(iret)
			{
				System.out.println("Choose which operation you want to perform");
				System.out.println("1. add Element inside Array");
				System.out.println("2. Display Elements inside Array");
				System.out.println("3. Print Even Odd");
				System.out.println("5. Exit !");
				iChoice=sobj.nextInt();

		switch(iChoice)
		{
			
			case 1:
				System.out.println("Enter number you want to enterd inside Array ");
				iElement=sobj.nextInt();
				dobj.add(iElement);
				break;
			case 2:
				System.out.println("Your Array Elements are ");
				dobj.display();
				break;
			case 3:
				dobj.evenOrOdd();
				break;
			case 5:
				iret=false;
				System.out.println("Exit !!!!!!");
				break;

			default:
				System.out.println("Please Enter Valid choice ");

		}
	}
	}
	catch(Exception e)
	{
		System.out.println("Exception throw"+e);
		
	}
	finally{
		System.out.println("Thanks For using Array");
	}
	}
}