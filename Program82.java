// Merge Two Lists 

import java.util.*;




class Program82
{
	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();


		list.add(45);
		list.add(77);
		list.add(95);
		list.add(13);
		list.add(79);
		list.add(95);
		list.add(19);
		list.add(56);

		ArrayList<Integer> list2=new ArrayList<>();

		list2.add(566);
		list2.add(152);
		list2.add(962);
		list2.add(426);
		list2.add(333);
		list2.add(231);
		list2.add(152);


		ArrayList<Integer> mergeList=new ArrayList<>(list);

		mergeList.addAll(list2);

		System.out.println(mergeList);



	}
}