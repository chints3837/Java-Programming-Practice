
import java.util.*;


class Parrent
{
	public int investmentAmmount;
	public Parrent(int i)
	{
		this.investmentAmmount=i;
	}

	public void investment()
	{
		System.out.println("inside parrent investment()");
	}
}



class Child extends Parrent
{
	public Child()
	{

	}

	public void childProperty()
	{
		System.out.println("inside childProperty()");
	}
}

class Program24
{
	public static void main(String[] args) {
		
		Child cobj=new Child();


		cobj.childProperty();
		cobj.investment();

	}
}