import java.util.*;




class Program67
{
	public static void main(String[] args) {

		Stack<Integer> st=new Stack<>();

		st.add(10);
		st.add(60);
		st.add(77);
		st.add(99);
		st.add(93);
		st.add(78);
		st.add(17);


		System.out.println(st);

		st.push(999);
		System.out.println(st);
	//	st.pop();
		System.out.println(st);

		System.out.println("10 object is present at index :"+st.search(100));

		System.out.println("Peak element is :"+st.peek());

			
	}
}