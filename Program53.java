

class Demo
{
	public final int iNo;

	public Demo(int iNo){
		this.iNo=iNo;
	}

	public int getiNo(){
		return this.iNo;
	}

	

}



class Program53
{
	public static void main(String[] args) {


		Demo dobj=new Demo(10);
		System.out.println("Value of iNo :"+dobj.getiNo())
;	}
}