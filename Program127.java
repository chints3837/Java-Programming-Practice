
import java.util.*;


class Program127
{
	public static void main(String[] args) {

		Map<String,Integer> hashMap=new HashMap<>();

		hashMap.put("Prajwal",556);
		hashMap.put("Prasad",02);
		hashMap.put("Sagar",741);
		hashMap.put("Shubham",853);
		hashMap.put("Rohan",222);
		hashMap.put("sandip",931);
		hashMap.put("Abhi",364);
		hashMap.put("Sanket",123);
		hashMap.put("Om",321);


		Iterator<String> it=hashMap.keySet().iterator();

		while(it.hasNext()){
			String key=(String)it.next();
			System.out.println("Key is  "+key +"  Value is : "+hashMap.get(key));
		}

	}
}