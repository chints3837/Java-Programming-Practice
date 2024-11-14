import java.util.*;


class Program128
{
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();

		arrayList.add(40);
		arrayList.add(80);
		arrayList.add(96);
		arrayList.add(112);
		arrayList.add(70);
		arrayList.add(23);
		arrayList.add(7);

		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}