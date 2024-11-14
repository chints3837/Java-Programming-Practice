import java.util.Scanner;

class Demo{

	public Demo(){
		System.out.println("Inside Demo constructor()");
	}

	public boolean checkPrime(int iNo){

		int iCnt=0;
		for(int i=2;i<iNo;i++){
			if(iNo % i ==0){
				iCnt++;
			}
			if(iCnt > 2)
			{
				break;
			}
		}
		if(iCnt>2){
			return false;
		}
		else{
			return true;
		}
	}
}

class Program86
{
	public static void main(String[] args) {

		System.out.println("Enter the Number :");
		Scanner sobj=new Scanner(System.in);
		int iNo=sobj.nextInt();
		Demo dobj=new Demo();
		boolean bRet=dobj.checkPrime(iNo)
;T		if(bRet == true){
			System.out.println("Number is Prime");
		}
		else{
			System.out.println("Number is not Prime");
		}
		
	}


}