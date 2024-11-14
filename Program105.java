

interface PrintableDocument
{
	public void printDocument();
}

interface EditableDocument
{
	public void editDocument();
}

interface SendDocument
{
	public void sendDocument();
}

class TxtDocument implements EditableDocument,PrintableDocument
{
	public void printDocument(){
		System.out.println("TxtDocument print()");
	}

	public void editDocument(){
		System.out.println("TxtDocument editable()");
	}
}


class Program105
{
	public static void main(String[] args) {
	
		TxtDocument txtDocument=new TxtDocument();

		txtDocument.printDocument();
		txtDocument.editDocument();

	}
}