// Java ForEach Loop


import java.util.*;

class Program22
{
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();

		list.add(10);
		list.add(50);
		list.add(60);
		list.add(80);
		list.add(10);
		list.add(90);
		list.add(50);
		list.add(100);
		list.add(19);
		list.add(11);

		Collections.sort(list);
		list.add(2000);

		list.forEach((e)-> {
			System.out.println(e);
		});

		

	}
}