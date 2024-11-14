import java.util.*;

interface Demo
{
	public int iValue=19;

	public String str="Prajwal";



}

class Employee implements Demo
{
	public Employee(){
		System.out.println("Inside Default constructor()");
	}

	public void display(){
		System.out.println("value of varibales present inside interface is :"+Demo.iValue +" and  :"+Demo.str);
	}
}


class Program100
{
	public static void main(String[] args) {
		





	}
}