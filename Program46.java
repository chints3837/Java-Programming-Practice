

class Demo{

	public static int iCnt=45;

	public int iNo;

	static{
		System.out.println("inside Static Block");
	}

	{
		System.out.println("Inside Unnamed Block");
	}

	public Demo(){
		System.out.println("inside Demo constructor()");
	}

	// public Demo(int iNo){
	// 	this.iNo=iNo;
	// }

	public static void display(){

		System.out.println("Static display ()");
	}

	public void displayAll(){
		System.out.println("Value od iCnt :"+iCnt);
		System.out.println("Value od iCnt :"+iNo);
	}
}



class Program46
{
	public static void main(String[] args) {

		System.out.println("inside main method");
		Demo dobj=new Demo();


	}
}