import java.util.*;


class Program66
{
	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();

		list.add(10);
		list.add(50);
		list.add(90);
		list.add(100);
		list.add(82);
		list.add(13);
		list.add(71);
		list.add(69);
		list.add(43);
		list.add(61);
		list.add(77);
		list.add(18);


		System.out.println(list.get(2));
		Iterator<Integer> it=list.iterator();
		System.out.println("Linked list is :");

		while(it.hasNext()){
			System.out.print(it.next()+" \t");
		}
		System.out.println();

					
	}
}