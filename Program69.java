
//Hashset collection
import java.util.*;



class Program69
{
	public static void main(String[] args) {

		HashSet<Integer> set=new HashSet<>();

		set.add(100);
		set.add(95);
	
		set.add(9);
		set.add(14);
		set.add(95);
		set.add(2000);
		set.add(55);
		System.out.println(set);

		System.out.println(set.contains(52));


		Iterator it=set.iterator();

		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
				
	}
		}
}