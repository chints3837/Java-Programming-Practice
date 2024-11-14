// import java.util.*;


class A
{

	public A()
	{
		System.out.println("Inside class A constructor()");
	}

	public int iNo;
	public int iValue;

	public void message(String msg){

		System.out.println("Class A  Message :"+msg);
	}

}

class B extends A
{
	public B(){
		super();
		System.out.println("Class B constructor()");
	}


	public void message(String msg){

		String str="Prajwal ";
		String result=str.concat(msg);
		System.out.println("Class B Message : "+result);
	}

}

class Program96
{
	public static void main(String[] args) {
	
		// B bobj=new B();
		// bobj.message("Sonawane");

		A aobj=new B();
		aobj.message("String");

	}
}