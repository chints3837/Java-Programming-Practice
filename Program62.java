// Fibonacci


class Program62
{
	public static void main(String[] args) {
		int iNo1=0;
		int iNo2=1;
		int iSum=0;
		int iTemp=0;
		System.out.print(iNo1 +"\t"+iNo2+"\t");
		for(int i=0;i<=10;i++){

			iSum=iNo1+iNo2;
			System.out.print(iSum+"\t");
		
			iNo1=iNo2;
			iNo2=iSum;
		}
	}
}