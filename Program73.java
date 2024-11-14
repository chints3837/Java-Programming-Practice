//LinkedHashMap
import java.util.*;

class Program73
{
	public static void main(String[] args) {
	
		Map<Integer,String> map=new LinkedHashMap<>();

		map.put(1,"prajwal");
		map.put(10,"prajwal");
		map.put(3,"prajwal");
		map.put(4,"prajwal");
		map.put(8,"prajwal");
		map.put(5,"prajwal");
		map.put(2,"prajwal");

		System.out.println(map);

		for(Integer key : map.keySet()){
			System.out.println("key "+key +": "+map.get(key));
		}

	}
}