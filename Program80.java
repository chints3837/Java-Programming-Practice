// Second Highest Number 





class Program80
{
	public static void main(String[] args) {

		int Arr[]={150,96,52,33,41,799,45,12,250,14,63,100};

		int high=0;

		int secondHigh=0;


		for(int i=0;i<Arr.length;i++){

			if(Arr[i]>high){
				secondHigh=high;
				high=Arr[i];
			} else if(Arr[i] > secondHigh)
			{
				secondHigh=Arr[i];
			}
		}

		System.out.println("Second highest is  :"+secondHigh);

		}
}