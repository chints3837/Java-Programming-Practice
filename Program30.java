//First Step

class Program30
{
	public static void main(String[] args) {
			
			int b=3;
			int pow=1;
			int mult=1;
		for(int i=0;i<=5;i++){

			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					pow=1;
					System.out.println(pow);
				}else{
					pow=pow*2;
					System.out.println(pow);
				}
			}
			System.out.println();

		}	

	}
}