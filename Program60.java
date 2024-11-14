//Check weather Vowel is present or not
import java.util.Scanner;

class Program60
{
	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sobj.nextLine();

		char ch[]=str.toCharArray();


		for(int i=0;i<ch.length;i++){
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
				System.out.print(ch[i]);
			}
		}


	}
}