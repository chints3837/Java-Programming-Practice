//String Reverse Using charAt
import java.util.*;

class Program35{

	public static void main(String[] args) {
		
		  java.util.Scanner sobj = new java.util.Scanner(System.in);

		  System.out.println("Enter String");
		  String str=sobj.nextLine();
		  strRev(str);



	}

	public static void strRev(String str){

		char ch;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			System.out.println(ch);
		}

		for(int i=str.length()-1;i>=0;i--){
			ch=str.charAt(i);
			System.out.println(ch);
		}

		        System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);  
	}
}
