
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Door{

	ArrayList<Integer> alist;

	private final Lock lock;

	private static Door obj;
	
	public static Door GetInstance()
	{
		if(obj == null)
			obj = new Door();
		return obj;
	}

	Door(){
		this.alist=new ArrayList<>();
		lock = new ReentrantLock();
	}

	synchronized void insert(int iNo){
		try{
				lock.lock();
				this.alist.add(iNo);
				lock.unlock();d
				Thread.sleep(500);
		}
		catch(Exception e){
			System.out.println("Exception :"+e.toString());
		}
		
	}

	void displayAll(){
		System.out.println(alist);
	}
}

class Prajwal extends Thread
{
	public Door door;
	public Prajwal()
	{
		this.door= Door.GetInstance();
	}

	public void run()
	{
		for (int i = 0;i < 10 ; ++i ) {
			door.insert(i);
			System.out.println("Inside Prajwal run() " + i);
			System.out.println(getName());
			door.displayAll();
		}	
	}
	
	public void insertElement(int iNo){

		door.insert(iNo);
	}

	public void show(){
		door.displayAll();
	}
}


class Sameer extends Thread
{

	public Door door;

	public Sameer(){
		this.door= Door.GetInstance();
	}

	public void run(){
		for (int i = 10;i < 20 ; ++i ) {
			System.out.println("Inside Prajwal run() " + i);	
			door.insert(i);
			System.out.println(getName());
			door.displayAll();
		}
	}

	public void insertElement(int iNo){
		door.insert(iNo);
	}

	public void show(){
		door.displayAll();
	}
}

class Program52
{
	public static void main(String[] args) {

		Prajwal pobj=new Prajwal();
		pobj.start();

		Sameer sobj=new Sameer();
		sobj.start();
		



		// pobj.insertElement(12);
		// pobj.insertElement(42);
		// sobj.insertElement(96);
		// pobj.insertElement(30);
		// pobj.insertElement(44);
		// pobj.insertElement(77);
		// sobj.insertElement(630);

		pobj.show();

		sobj.show();
		

		pobj.setName("t1");
		sobj.setName("t2");
	}
}