import java.util.Scanner;

class Program93
{
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		char[] Arr=new char[10];
		System.out.println("Enter Array Elements");	

		for(int i=0;i<Arr.length;i++){
			Arr[i]=sobj.next().charAt(0);
		}	

		System.out.println("Array is :");

		for(int i=0;i<Arr.length;i++){
			System.out.println(Arr[i]);
		}

		System.out.println("Vowels are :");

		for(int i=0;i<Arr.length;i++){

			if(Arr[i]=='a'||Arr[i]=='e'||Arr[i]=='i'||Arr[i]=='o'||Arr[i]=='u'){
				System.out.println("Vowels present :"+Arr[i]);
			}
		}
	}
}