import java.util.Scanner;


class Program90
{
	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sobj.next();

		System.out.println(str);

		char[] ch=str.toCharArray();

		System.out.println("Reverse String is ":);
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}
}