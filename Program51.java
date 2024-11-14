import java.util.*;

class Door 
{
	public ArrayList<Integer> alist;

	public Door(){
		this.alist=new ArrayList<>();
	}

	public void insert(int iNo){
		alist.add(iNo);
	}
}


class Demo extends Thread{

	public ArrayList<Integer> alist;

	public Demo(){
		this.alist=new ArrayList<>();
	}

	public void insert(int iNo){
		alist.add(iNo);
	}

	public void run(){
		insert()
	}
}

class Program51
{
	public static void main(String[] args) {

		Thread thread = new Thread()

	}
}