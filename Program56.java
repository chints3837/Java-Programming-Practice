import java.util.Scanner;


class Program56
{
	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter String");
		String str=new String(sobj.nextLine());
				
		char ch[]=str.toCharArray();


		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]+" ");
		}
	}
}