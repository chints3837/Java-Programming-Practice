


class Demo{

	public void addition(int iNo1,int iNo2){
		int sum=iNo1+iNo2;
		System.out.println("Addition is :"+sum);
	}

	public void addition(int iNo1,int iNo2,int iNo3){
		int sum=iNo1+iNo2+iNo3;
		System.out.println("Addition is :"+sum);
	}

	public void addition(int iNo1,double iNo2){
		double sum=iNo1+iNo2;

		System.out.println("Addition is :"+sum);
	}
}


class Program43
{
	public static void main(String[] args) {

	
		Demo dobj=new Demo();
		dobj.addition(10,20);
		dobj.addition(10,20,30);	
		dobj.addition(10,5.2);	
	}
}