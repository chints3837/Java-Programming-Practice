import java.util.Scanner;


class Program95
{
	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);

		int iNo=0;
		System.out.println("Enter Number :");
		iNo=sobj.nextInt();

		if(iNo % 2==0){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is Odd");
		}


	}
}