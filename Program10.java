//check Even Number
import java.util.*;

class Program9
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		int Arr[]=new int[10];
		System.out.println("Enter Array Element ");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			{
				System.out.println("Even number :"+ Arr[i]);
			}
		}
	}
}