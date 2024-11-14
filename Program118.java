import java.util.*;



class Program118
{
	public static void main(String[] args) {
		Map<Integer,String> hashMap=new HashMap<>();

		hashMap.put(1,"Prajwal");
		hashMap.put(5,"Mayur");
		hashMap.put(3,"Ashish");
		hashMap.put(2,"vaibhav");
		hashMap.put(6,"Sameer");
		hashMap.put(4,"Rohan");

		
		Iterator <Integer> it = hashMap.keySet().iterator();   
			while(it.hasNext())  
			{  
				int key=(int)it.next();  
				System.out.println("Roll no.: "+key+"     name: "+hashMap.get(key));  
			}
	}
}