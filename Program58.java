// Swap two number using temp variable
import java.util.Scanner;


class Program58
{
	public static void main(String[] args) {
		
		int iNo1;
		int iNo2;
		int temp;

		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Numbers :");
		iNo1=sobj.nextInt();
		iNo2=sobj.nextInt();

		System.out.println("Before Swapping of two numbers :"+" iNo1 = "+iNo1+" iNo2 = "+iNo2);

		temp=iNo1;
		iNo1=iNo2;
		iNo2=temp;


		System.out.println("After Swapping of two numbers :"+" iNo1 = "+iNo1+" iNo2 = "+iNo2);

	}
}