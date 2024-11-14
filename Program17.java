// Java Collection #List (ArrayList)

import java.util.*;



class Program17
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(40);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println("Before Sort");
		Collections.sort(list);

		System.out.println("After Sort");
		System.out.println(list);


	}
}