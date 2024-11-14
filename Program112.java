import java.util.stream.Collectors;
import java.util.*;


class Program112
{
	public static void main(String[] args) {

		ArrayList<Integer> arraylist=new ArrayList<>();

		arraylist.add(74);
		arraylist.add(84);
		arraylist.add(24);
		arraylist.add(99);
		arraylist.add(63);
		arraylist.add(45);
		arraylist.add(52);
		arraylist.add(96);



		ArrayList<Integer> fil=arraylist.stream()
										.filter(n ->  n%2 !=0)
										.collect(Collectors.toList());


		System.out.println(fil);


			
	}
}