import java.util.Scanner;

class Program87
{
	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter size of Array :");
		int iSize=sobj.nextInt();

		int Arr[]=new int[iSize];


		System.out.println("Enter Elements :");
		for(int i=0;i<Arr.length;i++){
			Arr[i]=sobj.nextInt();
		}

		System.out.println("Array Element is :");
		for(int iValue:Arr){
			System.out.println(iValue);
		}

	}
}