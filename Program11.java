//Sort Array using Arrays inbuilt Function

import java.util.*;

class Program11
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		int Arr[]=new int[10];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		Arrays.sort(Arr);
		System.out.println("Sorted Array :");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}

	}
}