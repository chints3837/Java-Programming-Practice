// Treemap
import java.util.*;


class Program74
{
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();

		map.put(1,"Prajwal");
		map.put(6,"Prasad");
		map.put(9,"Rohan");
		map.put(8,"sanket");
		map.put(5,"Ashish");
		map.put(11,"Saurabh");

		System.out.println(map);
		map.put(2,"Ninad");
		map.put(45,"Ketan");
		map.put(20,"Sameer");
		map.put(23,"Athz");

		for(Integer key : map.keySet()){
			System.out.println("key "+key+":"+map.get(key));
		}
	}
}