
interface ArrayX{

	 int Arr[]=new int[5];

	 default void display(){
	 	for(int i=0;i<Arr.length;i++)
	 	{
	 		System.out.print(Arr[i]+"\t");
	 	}
	 	System.out.println();
	 }
	 public void displayEven();
	 public void add(int iNo);
}


class Arr implements ArrayX{
	public int iCnt=0;

	public Arr(){
		this.iCnt=0;
	}

	public void displayEven(){
		System.out.println("Even elments of an Array is :");
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i] % 2 ==0)
			{
				System.out.print(Arr[i]+"\t");
			}
			
		}
		System.out.println();
		
	}

	// public void display(){
	// 	System.out.println("Inside Display()");

	// 	for(int i=0;i<Arr.length;i++){
	// 		System.out.print(Arr[i]+"\t");
	// 	}
	// 	System.out.println();
	// }

	public void add(int iNo){
		if(iCnt == 5)
		{
			System.out.println("Array is Full");
		}
		else{
			Arr[iCnt]=iNo;
			iCnt++;	
		}
		
	}

	public void display(){
		System.out.println("hi");
		System.out.println("prajwal");
		System.out.println("sonwane");
	}
}


class B implements ArrayX{

	public int iCnt=0;

	public B(){
		this.iCnt=0;
	}

	public void displayEven(){
		System.out.println("Inside Class B Overriding displayEven()");
	
	}

	 public void add(int iNo){
	 	
	 	if(iCnt == 5)
		{
			System.out.println("Array is Full");
		}
		else{
			Arr[iCnt]=iNo;
			iCnt++;	
		}
	 }

}

class Program41
{
	public static void main(String[] args) {
		
		Arr aobj=new Arr();
		aobj.add(10);
		aobj.add(45);
		aobj.add(85);
		aobj.add(14);
		aobj.add(96);
		aobj.add(20);
		aobj.displayEven();
		aobj.display();


		B bobj=new B();

		bobj.add(123);
		bobj.add(741);
		bobj.add(441);
		bobj.add(553);
		bobj.add(985);

		bobj.display();
	}
}