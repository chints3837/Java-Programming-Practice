

abstract class ArrayX{

	private int Arr[];
	private int iCnt;
	private int size;

	public ArrayX(int size){
		this.Arr=new int[size];
		this.iCnt=0;
		this.size=size;
	}

	public void addElement(int iNo){

		if(iCnt == size){
			System.out.println("Array is Full");
		}
		else{
			Arr[iCnt]=iNo;
			this.iCnt++;
		}
		

	}

	public void displayAll(){
		for(int i=0;i<Arr.length;i++){
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
	}

	abstract void display();
}


class Demo extends ArrayX{

	public Demo(int size){
		super(size);
	}


	public void display(){
		System.out.println("Method Overriding ...");
	}

}

class Program40
{
	public static void main(String[] args) {

		Demo dobj=new Demo(5);
		dobj.addElement(10);
		dobj.addElement(22);
		dobj.addElement(63);
		dobj.addElement(55);
		dobj.addElement(74);
		dobj.addElement(99);
		dobj.displayAll();
		dobj.display();
		
	}
}