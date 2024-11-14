//OOPS Concpet 

import java.util.*;

interface A
{
	public int iNo=10;

	public void show();

	default void gun()
		{
			System.out.println("inside default gun ()");
		}
}

class C
{
	public void fun()
	{
		System.out.println("inside class C fun ()");
	}
}
class B extends C implements A 
{
	public B()
	{
		System.out.println("inside class B constructor");
	}

	public void show()
	{
		System.out.println("Override method");
	}

}


class Program16
{
	public static void main(String[] args) {
		B obj=new B();
		obj.show();
		obj.gun();
	}
}