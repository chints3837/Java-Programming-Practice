
// Highest Number Using Inbuild method

import java.util.*;


class Program81
{
	public static void main(String[] args) {

	int Arr[]={150,96,52,33,41,799,45,12,250,14,63,100,560,350,99,165,450,562,74};

		Arrays.sort(Arr);

	int highest=Arr[Arr.length-1];
	int second=Arr[Arr.length-2];

	System.out.println("Highest element is :"+highest);
	System.out.println("Second heighest element is :"+second);
}
}