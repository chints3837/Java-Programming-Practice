

interface Demo
{
	public void myFun();
}


class Program109
{
	public static void main(String[] args) {
		

		Demo dobj=new Demo(){

			public void myFun()
			{
				System.out.println("inside myFun()");
			}
		};

		dobj.myFun();

	}
}