// Prime
import java.util.Scanner;


class Program126
{
	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number you want to check prime or not");
		int iNo=sobj.nextInt();
		int iCnt=0;

		for(int i=2;i<92 || iCnt <= 0;i++)
		{
			if(iNo % i == 0)
			{
				iCnt++;
			}
		}	
		System.out.println("inct value : "+iCnt);
		if(iCnt >1)
		{
			System.out.println("Number is not Prime");
		}
		else{
			System.out.println("Number is prime");
		}
	}
}