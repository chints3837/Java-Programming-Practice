

interface Demo
{
	public void showName(String name,int iNo);
}

class Program111
{
	public static void main(String[] args) {
		
		
		Demo dobj=(name,iNo)->{

			System.out.println("Given Name is :"+name);
			System.out.println("Integer is :"+iNo);
		};

		dobj.showName("Prajwal",11);
	}
}