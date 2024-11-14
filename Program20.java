// Java Collection #List (stk)


import java.util.*;

class Program20
{
	public static void main(String[] args) {
		
		Stack<Integer> stk=new Stack<>();

		stk.add(10);
		stk.push(50);
		stk.push(60);
		stk.push(80);
		stk.push(10);
		stk.push(90);
		stk.push(50);
		stk.push(100);
		stk.push(19);
		stk.push(11);

		Collections.sort(stk);
		stk.push(2000);

		System.out.println(stk);
		stk.remove(1); //remove element present at 2 place
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);

		

	}
}