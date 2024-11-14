
interface DEMO
{
	int iValue=10;
	// public static final int iValue=10;
	public static final float fValue=20.45f;
	public static final String sValue="Prajwal";

	default void funDefault(){
		System.out.println("this is default method");
	}

	public void sum();


}

class son implements DEMO
{

	public son(){

		System.out.println("son constructor()");
	}

	public void fun(){
		System.out.println("fun method () in son");
	}

	public void sum(){
		System.out.println("Method Overriding ");
	}
}


class Program97
{
	public static void main(String[] args) {
	
	System.out.println("Values in interface");

	System.out.println(DEMO.iValue);
	System.out.println(DEMO.fValue);
	System.out.println(DEMO.sValue);
		son sobj=new son();
		sobj.fun();
		sobj.funDefault();
		System.out.println(sobj.iValue);

		sobj.sum();

	}
}