


abstract class ArrayX
{
	int Arr[];
	int iCnt;
	public ArrayX(int size){
		System.out.println("Abstract class Constructor()");

		Arr=new int[size];
		iCnt=0;
	}

	public void addElement(int iValue){
		
		if(Arr.length != iCnt){
			Arr[iCnt]=iValue;
			iCnt++;	
		}
		else{
			System.out.println("Array index is Full");
		}
		
	}

	public void display(){
		System.out.println("Array Eleements are :");
		for(int i=0;i<iCnt;i++){
			System.out.print("|"+Arr[i]+"|"+"");
		}
		System.out.println();
	}

	public abstract 
	void findValue(int iValue);
}

class Demo extends ArrayX
{
	public Demo(int size){
		super(size);
	}

	public void findValue(int iValue)
	{
		for(int i=0;i<iCnt;i++)
		{
			if(Arr[i] == iValue){
				System.out.println("Value "+iValue+" Present at index :"+i);
			}
		}
	}

	public void printEven(){
		System.out.println("Even Numbers are :");

		for(int i=0;i<iCnt;i++)
		{
			if(Arr[i] % 2 == 0){
				System.out.print(Arr[i]+"\t");
			}


		}
		System.out.println)(;
	}


}

class Program98
{
	public static void main(String[] args) {
		
			Demo dobj=new Demo(5);
			dobj.addElement(10);
			dobj.addElement(29);
			dobj.addElement(30);
			

			dobj.display();

			dobj.addElement(45);
			dobj.display();
			dobj.addElement(50);
			//dobj.addElement(40);
			dobj.display();
			dobj.addElement(60);
			dobj.display();


			dobj.findValue(30);

			dobj.printEven();


	}	
}