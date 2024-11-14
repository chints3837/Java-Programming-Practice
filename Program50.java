// Lazy Instantiation using static block


class LazySingleton{

	private static LazySingleton instance;

	static{

		try{

			if(instance == null){
				instance=new LazySingleton();
			}
			else{
				System.out.println("Instance is already Created !");
			}
		}
		catch(Exception e){
			System.out.print("Exception occured :"+e.toString());
		}
	}

	public static LazySingleton getInstance(){
		return instance;
	}

	public void gun(){
		System.out.println("Inside gun()");
	}
}


class Program50
{
	public static void main(String[] args) {
		

		LazySingleton singleton=LazySingleton.getInstance();
		singleton.gun();

		LazySingleton singleton1=LazySingleton.getInstance();
		singleton1.gun();


	}
}