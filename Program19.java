// Java Collection #List (Vector)


import java.util.*;

class Program19
{
	public static void main(String[] args) {
		
		List<Integer> vec=new Vector<>();

		vec.add(10);
		vec.add(50);
		vec.add(60);
		vec.add(80);
		vec.add(10);
		vec.add(90);
		vec.add(50);
		vec.add(100);
		vec.add(19);
		vec.add(11);

		Collections.sort(vec);

		System.out.println(vec);
		vec.remove(1); //remove element present at 2 place
		System.out.println(vec);

		

	}
}