import java.util.Scanner;

class Program94
{
	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);

		int iNo=0;
		System.out.println("Enter Number :");
		iNo=sobj.nextInt();
		int iCnt=0;
		for(int i=2;i<iNo;i++){

			if(iNo %i ==0){
				System.out.println("inside ");
				iCnt++;
			}
		}	
		if(iCnt !=0){
			System.out.println("Number is not Prime");
		}
		else{
			System.out.println("Numver is Prime");
		}
		

	}
}