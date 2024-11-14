
import java.util.*;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.Observable;  

class ResponseHandler1 implements Observer
{
	private String resp;

	public void update(Observable obj, Object arg)
	{
		if(arg instanceof String)
		{
			resp=(String)arg;
			System.out.println("Response comming from Observable :"+resp);
		}
	}
}

class ResponseHandler2 implements Observer
{
	private String resp;

	public void update(Observable obj, Object arg)
	{
		if(arg instanceof String)
		{
			resp=(String)arg;

			System.out.println("Response comming from Observable :"+resp);
		}
	}
}

class EventSource extends Observable implements Runnable
{

	public void run(){

		try{

			InputStreamReader isr = new InputStreamReader(System.in);  
       		BufferedReader br = new BufferedReader(isr);  

       		while(true)
       		{
       			String response = br.readLine();  
                setChanged();  
                notifyObservers(response);  
       		}	
		}
		catch(Exception e){
			System.out.println("Exception Occured :"+e);
		}
		



	}
}


class Program106
{
	public static void main(String[] args) {
		
		EventSource eventSource=new EventSource();
		Thread t1=new Thread(eventSource);
		t1.start();
	}
}