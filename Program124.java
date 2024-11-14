import java.util.*;


class Program124
{
	public static void main(String[] args) {
		Map<String,Integer> hashMap=new HashMap<>();


		hashMap.put("Prajwal",15);
		hashMap.put("Prasad",35);
		hashMap.put("Sameer",85);
		hashMap.put("Rohan",95);
		hashMap.put("Sanket",563);
		hashMap.put("Sagar",792);
		hashMap.put("Saurabh",96);
		hashMap.put("Gaurav",88);
		hashMap.put("Niand",80);


		Iterator<String> it=hashMap.keySet().iterator();

		while(it.hasNext()){
			String key=(String)it.next();
			System.out.println("Key is "+key+" Value is :"+hashMap.get(key));
		}

		Map<String,Integer> treeMap=new TreeMap<>();
		treeMap.putAll(hashMap);

		System.out.println(hashMap);
		System.out.println(treeMap);
	}
}