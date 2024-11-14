import java.util.*;

class Program119
{
	public static void main(String[] args) {
		
		TreeMap<Integer,String> treemap=new TreeMap<>();

		treemap.put(4,"Omkar");
		treemap.put(5,"Vaibhav");
		treemap.put(1,"Prajwal");
		treemap.put(2,"Rohan");
		treemap.put(3,"Sameer");


		Iterator<Integer> it=treemap.keySet().iterator();

		while(it.hasNext())
		{
			int key=(int)it.next();
			System.out.println("Key is :"+key +" value is :"+treemap.get(key));
		}

		System.out.println(treemap);
		
	}
}