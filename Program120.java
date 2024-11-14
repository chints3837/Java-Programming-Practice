
import java.util.*;


class Program120
{
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<>();

		hashMap.put(1,"Prajwal");
		hashMap.put(3,"Sagar");
		hashMap.put(2,"Sameer");
		hashMap.put(4,"Mahesh");
		hashMap.put(8,"Rohan");
		hashMap.put(7,"Sarang");
		hashMap.put(9,"Sanket");
		hashMap.put(5,"Shewta");
		hashMap.put(6,"Prasad");
		hashMap.put(10,"Prajwal");


		for(var hobj:hashMap.entrySet()){
			System.out.println("key is :"+hobj.getKey() +" Value is :"+hobj.getValue());
		}
	}
}