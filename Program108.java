
interface Demo
{
	public void fun();
}


class Program108
{
	public static void main(String[] args) {
		
		Demo dobj=new Demo(){

			public void fun()
			{
				System.out.println("inside fun method ()");
			
}
		};
		dobj.fun();
	}
}