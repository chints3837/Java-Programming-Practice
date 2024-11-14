

interface Car
{
	public void engineType();
}

class PetrolCar implements Car
{
	public void engineType(){
		System.out.println("This is PetrolCar Engine");
	}
}

class DiselCar implements Car
{
	public void engineType(){
		System.out.println("This is DiselCar Engine");
	}
}

class EVCar implements Car
{
	public void engineType(){
		System.out.println("This is EVCar Engine");
	}
}




class Program103
{
	public static void main(String[] args) {
		

		Car car=new EVCar();
		car.engineType();
	}
}