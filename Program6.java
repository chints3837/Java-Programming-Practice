import java.util.*;

class Demo
{
	public String str;
	public Demo(String str)
	{
		this.str=str;
	}
	public Demo()
	{

	}

	public void printVowel(String str)
	{
		char Arr[]=str.toCharArray();
		System.out.println("Vowels present in string is :");

		for(int i=0;i<Arr.length;i++){
			if(Arr[i]=='a' || Arr[i]=='e' || Arr[i]=='i' || Arr[i]=='o' || Arr[i]=='u')
			{
				System.out.println("vowel is :"+Arr[i]);
			}
		}
	}

}


class Program6
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sobj.nextLine();
		Demo dobj=new Demo();
		dobj.printVowel(str);



	}
}