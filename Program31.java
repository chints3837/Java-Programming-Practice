//Second Step

class Program31
{
	public static void main(String[] args) {
			
			int b=3;
			int pow=1;
			int mult=1;
			int add=0;
		for(int i=0;i<=5;i++){

			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					pow=1;
					mult=pow*b;
					
				}else{
					pow=pow*2;
					mult=pow*b;	
				}

				
			}
			System.out.println();
			

		}	

	}
}