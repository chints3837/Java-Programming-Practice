




abstract class Base{

	public int iNo;

	public void fun(){
		System.out.println("Inside Base Fun");
	}

	public void gun(){
		System.out.println("Inside gun");
	}

	abstract void sum();

}

class Derived extends Base{

	public void sun(){
		System.out.println("Inside Sun()");
	}

	public void fun(){
		System.out.println("Inside Derived fun()");
	}



	public void sum(){
		System.out.println("Inside sum override");
	}
}

class Program42{
	public static void main(String[] args) {

		Derived dobj=new Derived();
		dobj.sun();
		dobj.fun();

		dobj.sum()
;		
	}
}