//Find Largest Number From Array 
import java.util.*;


class Program14
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		int Arr[]=new int[10];
		int iResult=0;
		System.out.print("Enter Array Element :");
		for(int i=0;i<Arr.length;i++){
			Arr[i]=sobj.nextInt();
		}		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>iResult)
			{
				iResult=Arr[i];
			}
		}
		System.out.println("largest Number is :"+iResult);
		
	}
}