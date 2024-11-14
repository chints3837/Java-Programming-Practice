import java.util.Scanner;	

class Program92
{
	public static void main(String[] args) {
		int a=0;
		int b=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter two numbers :");
	

		a=sobj.nextInt();
		b=sobj.nextInt();

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);

	}
}