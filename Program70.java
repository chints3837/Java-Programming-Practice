
//LinkedHashset in java
import java.util.*;



class Program70
{
	public static void main(String[] args) {

		LinkedHashSet<Integer> set=new LinkedHashSet<>();

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
		System.out.println();
		}
}