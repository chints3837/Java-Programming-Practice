// Java Collection


import java.util.*;




class Program65
{
	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();


		list.add(10);
		list.add(85);
		list.add(99);
		list.add(66);
		list.add(41);
		list.add(92);
		list.add(97);
		list.add(13);
		list.add(78);
		list.add(68);

		System.out.println(list);	
		System.out.println("size of ArrayList is :"+list.size());
		System.out.println("Element at position 2 is   "+list.get(1));
				
	}
}