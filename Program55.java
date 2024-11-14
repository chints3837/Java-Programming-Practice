
class Demo{

	public int iNo;
	public String name;

	public Demo(){
		System.out.println("Inside Demo constructor()");
	}

	public void display(){

		try{

			for(int i=0;i<=10;i++){
			System.out.println("Inside For loop :"+i);
			Thread.sleep(500);
		}

		}
		catch(Exception e){
			System.out.println("Exception Occured :"+e.toString());
		}
		
	}

	public void finalize(){
		System.out.println("finalize Demo ()");
	}
}



class Program55
{
	public void finalize(){
		System.out.println("finalize ()");
	}
	public static void main(String[] args) {
		Demo dobj1=new Demo();
		Demo dobj2=new Demo();

		dobj1.display();
		dobj2.display();

		dobj1=null;
		dobj2=null;

		System.gc();	

		
	}
}