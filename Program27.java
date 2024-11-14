/// Bill Payment Loosely Coupling and Dependency Injection


interface BillPayment
{
	public void payBill();
}

class Cash implements BillPayment
{
	public void payBill()
	{
		System.out.println("Bill Paid Using Cash");
	}
}
class Scanner implements BillPayment
{
	public void payBill()
	{
		System.out.println("Bill Paid Using Scanner");
	}
}

class CreditCard implements BillPayment
{
	public void payBill()
	{
		System.out.println("Bill Paid Using CreditCard");
	}
}

class DebitCard implements BillPayment
{
	public void payBill()
	{
		System.out.println("Bill Paid Using DebitCard");
	}
}

class Test
{
	private BillPayment billPayment;
	public Test(BillPayment billPayment)
	{
		this.billPayment=billPayment;
	}

	public void payment()
	{
		this.billPayment.payBill();
	}

}




class Program27
{
	public static void main(String[] args) {
	
		Test tobj=new Test(new CreditCard());	
		tobj.payment();
	}
}