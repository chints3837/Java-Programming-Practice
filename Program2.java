

class A{
	public A(){
		System.out.println("Constructor A");
	}

	public void Show(){
		System.out.println("Inside Show of A");
	}
}

class B extends A{

	public  B(){
		System.out.println("Inside B Constructor");
	}

	public void display(){
		System.out.println("Inside display()");
	}
}



class Program2
{
	public static void main(String[] args) {
		
		System.out.println("Inside Main method");
	}

	 B bobj=new (B);

	 bobj.Show();
	 bobj.display();
}