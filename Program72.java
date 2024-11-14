//HashMap 
import java.util.*;

class Program72
{
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();

		map.put(1,"Prajwal");
		map.put(2,"Prasad");
		map.put(4,"Sameer");
		map.put(6,"Ninad");
		map.put(3,"Sagar");
		map.put(5,"Rohan");
	
	

		System.out.println(map);
		map.put(100,"Vipul");

		//Using KeySet and Iteration
		for(Integer key : map.keySet()){
			System.out.println("key :"+key +": "+map.get(key));
		}
	}
}