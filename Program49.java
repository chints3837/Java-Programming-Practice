//Singleton with Eager insalisation

class EagerSingleton
{
	private static EagerSingleton eagerSingleton=new EagerSingleton();

	private EagerSingleton(){

	}

	public static EagerSingleton getInstance(){
		return eagerSingleton;
	}

	public void display(){
		System.out.println("Inside display()");
	}
}




class Program49
{
	public static void main(String[] args) {
		
		EagerSingleton singleton=EagerSingleton.getInstance();
		singleton.display();

	}
}