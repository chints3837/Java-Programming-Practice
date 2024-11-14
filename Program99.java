
import java.util.*;

class Program99
{
	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist=new ArrayList<>();

		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(60);
		arraylist.add(90);
		arraylist.add(100);
		arraylist.add(70);
		arraylist.add(80);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);

		// arraylist.forEach((item)->
		// {
		// 	System.out.println(item);
		// });

		System.out.println("Before Sorting");
		arraylist.forEach(System.out::println);


		System.out.println("After sorting");
		arraylist.stream().sorted().forEach(System.out::println);
	}
}