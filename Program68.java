import java.util.*;


class Program68
{
	public static void main(String[] args) {

		Vector<Integer> vec=new Vector<>();
		
			vec.add(100);
			vec.add(741);
			vec.add(523);
			vec.add(145);
			vec.add(923);
			vec.add(745);
			vec.add(420);
			vec.add(356);
			vec.add(210);
			vec.add(516);


			Iterator it=vec.iterator();

			while(it.hasNext()){
				System.out.print(it.next()+"\t");
			}
			System.out.println();

			System.out.println(vec.isEmpty());
			System.out.println(vec.indexOf(145));
			vec.remove(0);
			System.out.println(vec.indexOf(145));
			System.out.println(vec);
			vec.add(0,100);
			System.out.println(vec);


	}
}