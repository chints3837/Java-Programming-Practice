import java.util.*;

abstract class ArrayX
{
	public int Arr[];
	public int iSize;
	public ArrayX(int size)
	{
		System.out.println("Inside ArrayX constructor ()");
		this.Arr=new int [size];
		this.iSize=0;
	}

	public void displayAll()
	{
		System.out.println("Array Elements are :");
		for(int i=0;i<Arr.length;i++)
		{	
		
			System.out.print("|"+Arr[i]+"|"+"->");

		}
		System.out.println();
	}

	public void insert(int iNo)
	{
		if(iSize<this.Arr.length)
		{
			this.Arr[iSize]=iNo;
			this.iSize++;
		}	
		
	}
	public abstract void add();
}

class Demo extends ArrayX
{
	public Demo(int size)
	{
		super(size);
		System.out.println("Inside Demo Constructor()");
	}

	public void add(){
		System.out.println("Inside add()");
	}
}

class Program3
{
	public static void main(String[] args)
	{
		
		Demo dobj=new Demo(5);
		dobj.displayAll();
		dobj.insert(5);
	}
}