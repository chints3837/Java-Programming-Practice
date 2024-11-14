import java.util.Scanner;


class Program39
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sobj.nextLine();
		char ch;
		StringBuffer strBuffer=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			strBuffer.append(str.charAt(i));
			//StringBuffer=str.charAt(i);
		}
		System.out.println("String Buffer is :"+strBuffer);
		String bb=strBuffer.toString();

		if(strBuffer.toString().equals(str)){
			System.out.println("string is Pallindrome");
		}
	}
}