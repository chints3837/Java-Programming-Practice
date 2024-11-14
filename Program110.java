
import java.util.*;


class Program110
{
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();

		list.add(45);
		list.add(35);
		list.add(7);
		list.add(91);
		list.add(33);
		list.add(41);
		list.add(99);
		list.add(85);

		// list.forEach((n)->System.out.println(n)
		// );


		Iterator<Integer> it=list.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}



	}
}