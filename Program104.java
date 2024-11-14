

interface Document
{
	public void printDocument();

	public void editDocument();

	public void saveDocument();

	public void sendDocument();
}


class TxtDocument implements Document
{

	public void printDocument(){
		System.out.println("TxtDocument printDocument()");
	}

	public void editDocument(){
		System.out.println("TxtDocument editDocument()");
	}

	public void saveDocument(){
		System.out.println("TxtDocument saveDocument()");
	}

	public void sendDocument(){
		System.out.println("TxtDocument sendDocument()");
	}
}


class Program104
{
	public static void main(String[] args) {
		
	}
}