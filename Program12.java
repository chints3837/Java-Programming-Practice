//Find Factorial 
import java.util.*;


class Program12
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		int iRet=1;
		System.out.println("Enter Number :");
		int iNo=sobj.nextInt();
		for(int i=1;i<=iNo;i++)
		{
			iRet=iRet*i;
		}
		System.out.println("Facorial is :"+iRet);
	}
}