


interface Payment
{
	
	public void processPayment();
}


class CreditCard implements Payment
{
	public void processPayment()
	{
		System.out.println("Payment is done using credit card");
	}
}

class DebitCard implements Payment
{
	public void processPayment()
	{
		System.out.println("Payment is done using Debit card");
	}
}

class NetBanking implements Payment
{
	public void processPayment()
	{
		System.out.println("Payment is done using NetBanking");
	}
}



class Program101
{
	public static void main(String[] args) {
		
		Payment paymentMethod=new DebitCard();
		paymentMethod.processPayment();
	}
}