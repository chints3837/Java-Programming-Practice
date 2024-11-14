import java.util.Scanner;
import java.util.*;
class Program88
{
	public static void main(String[] args) throws Exception 
	{
		
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the Array List ");

		ArrayList<Integer> aobj=new ArrayList<>();

		aobj.add(10);
		aobj.add(60);
		aobj.add(80);
		aobj.add(20);
		aobj.add(40);
		aobj.add(90);
		aobj.add(70);
		aobj.add(50);
		aobj.add(40);
		aobj.add(660);
		aobj.add(182);

		System.out.println("Unsorted ArrayList is :");
		System.out.println(aobj);

		Collections.sort(aobj);
		System.out.println("Sorted ArrayList");
		System.out.println(aobj);
	}
}