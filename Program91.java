import java.util.Scanner;


class Demo
{
	public void reverseString(String str){

		System.out.println("Given String is :"+str);

		char ch[]=str.toCharArray();

		char abc;
		for(int i=ch.length-1;i>=0;i--){
			//abc=str.charAt(i);
			System.out.println(str.charAt(i));
		}
		
	}
}

class Program91
{
	public static void main(String[] args) {

		String str=new String("Hello World");

		Demo dobj=new Demo();
		dobj.reverseString(str);


	}
}