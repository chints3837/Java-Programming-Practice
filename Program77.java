// Reverse LinkedList
import java.util.*;
class Program77
{
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();

		list.add(10);
		list.add(19);
		list.add(45);
		list.add(93);
		list.add(12);
		list.add(36);
		list.add(46);
		list.add(33);
		list.add(18);
		list.add(59);

		System.out.println(list);
		System.out.println("Size of LinkedList :"+list.size());

		for(int i=list.size()-1;i>=0;i-)-{
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
}