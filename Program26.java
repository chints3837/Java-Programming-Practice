

interface Singer
{
	public void sing();
}

class PopSinger implements Singer{

	public void sing()
	{
		System.out.println("Singing Song with Pop Music");
	}
}

class Clasical implements Singer
{
	public void sing()
	{
		System.out.println("Singing Song with Classical Music");
	}

}




class Program26
{
	public static void main(String[] args) {
		Singer sobj;

		sobj=new Clasical();
		sobj.sing();

		sobj=new PopSinger();
		sobj.sing();

	}
}