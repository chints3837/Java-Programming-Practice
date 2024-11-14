
// Annonumous Inner Class



class Demo{

	public void fun(){
		System.out.println("Inside fu()");
	}

	abstract class Animal{

		public void pet();
	
}}




class Program48
{
	public static void main(String[] args) {
		

		Demo dobj=new Demo();
		dobj.fun();
		Animal aobj=new Animal(){

			public void pet(){
				System.out.println("Dog is pet");
			}
		};

	}
}