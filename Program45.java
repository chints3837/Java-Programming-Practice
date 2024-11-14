
class Base{

	private int iNo1;
	protected int iNo2;
	public int iNo3;

	public Base(){
		this.iNo1=45;
		this.iNo2=50;
		this.iNo3=60;
	}
}


class Derived1 extends Base{

	public void getMember(){

		System.out.println("Value of iNo3 is : "+iNo3);	
		System.out.println("Value of iNo2 is : "+iNo2);	
		// System.out.println("Value of iNo1 is : "+iNo1);	

	}
}

class Derived2 extends Derived1
{
		public void getMembers(){
			System.out.println("inside Derived 2");
				System.out.println("Value of iNo2 is : "+iNo2);	

		}
}



class Program45
{
	public static void main(String[] args) {

		Derived1 dobj1=new Derived1();
		dobj1.getMember();
		

		Derived2 dobj2=new Derived2();
		dobj2.getMembers();

	}
}