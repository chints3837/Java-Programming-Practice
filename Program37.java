//Using CharAt Reverse
import java.util.Scanner;

class Program37
{
	public static void main(String[] args) {
		
        Scanner sobj = new Scanner(System.in); 
        char ch;
        System.out.println("Enter String you want to reverse");
        String str=sobj.nextLine();
        System.out.println("Original string :"+str);
        for(int i=str.length()-1;i>0=;i--){

            System.out.print(str.charAt(i)+"\t");
        }

	}
}