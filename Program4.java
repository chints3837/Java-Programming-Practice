import java.util.*;


class Demo
{
	public String str;
	public Demo(String str)
	{
		this.str=str;
	}
	public void reverseString(String str)
	{
		char Arr[]=str.toCharArray();
		System.out.println("size of Array :"+Arr.length);
		for(int i=Arr.length-1;i>=0;i--)
		{
			System.out.println(Arr[i]);
		}
	}

}


class Program4
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String you want to reverse String :");
		String st=sobj.nextLine();
		Demo dobj=new Demo("Prajwal");
		dobj.reverseString("Prajwal");
	}
}