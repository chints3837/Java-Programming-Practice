import java.util.Scanner;

class Program36
{
	public static void main(String[] args) {
		
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter String you want to reverse");
        String str=sobj.nextLine();
        System.out.println("Original string :"+str);
        char Arr[]=str.toCharArray();

        for(int i=Arr.length-1;i>=0;i--){
        	System.out.print(Arr[i]+"\t");
        }
        System.out.println()
;
	}
}