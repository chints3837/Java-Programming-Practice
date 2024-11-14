//Check weather Number is Prime or not
import java.util.Scanner;

class Program61
{
	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number :");
		int iNo=sobj.nextInt();

		for(int i=2;i< iNo/2;i++){

			if(iNo %i ==0){
				System.out.println("Number is not Prime");
				break;
			}
			else{
				System.out.println("Number is prime");
			}
		}
	}
}