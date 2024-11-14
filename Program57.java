// Reverse String Using charAt

import java.util.Scanner;


class Program57
{
	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sobj.nextLine();

		char ch;
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}