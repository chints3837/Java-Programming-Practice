// Linear Seearch 
import java.util.Scanner;
class Program83
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		int Arr[]={10,50,21,30,74,63,94,11,52,36,};

		System.out.println("Array Elements are :");

		for(int i=0;i<Arr.length;i++){
			System.out.print("|"+Arr[i]+"|"+" ");
		}
		System.out.println();

		System.out.println("Enter Number to find Element :");
		int iNo=sobj.nextInt();

		for(int i=0;i<Arr.length;i++){
			if(Arr[i] == iNo){
				System.out.println("Element Found at Index :"+i+" and element is :"+Arr[i]);
			}

		}
	}
}