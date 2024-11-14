import java.util.*;





class Program107
{
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();

		list.add(15);
		list.add(85);
		list.add(44);
		list.add(12);
		list.add(96);
		list.add(95);
		list.add(47);
		list.add(30);
		list.add(36);
		list.add(74);
		list.add(66);


		list.sort((x2,x1)-> x2.compareTo(x1));
		System.out.println(list);

		
	}
}