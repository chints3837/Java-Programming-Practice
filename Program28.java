

class Program28
{
	public static void main(String[] args) {
		
		int Arr[]=new int[5];
		Arr[0]=10;
		Arr[1]=20;
		Arr[2]=30;
		Arr[3]=40;
		Arr[4]=50;

		try
		{
			for(int i=0;i<=Arr.length;i++)
			{	
				System.out.println(Arr[i]);
			}	
		}
		catch(Exception e)
		{
			System.out.println("Exception throw :"+e.toString());
		}
		
		System.out.println("Hello");


	}
}