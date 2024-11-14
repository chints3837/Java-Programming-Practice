//Check Prime Number

import java.util.*;

class Demo
{


	public boolean checkPrime(int iNo)
	{
		for(int i=2;i<iNo;i++)
		{
			if(iNo%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

class Program7
{
	public static void main(String[] args) {
		boolean iRet=false;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number :");
		int iNo=sobj.nextInt();
		Demo dobj=new Demo();
		iRet=dobj.checkPrime(iNo);
		if(iRet==false){
			System.out.println(iNo+ "Number is Not Prime");
		}
		else {
			System.out.println(iNo+"Number is Prime");
		}
	}
}