// Largest Number in Array


class Program79
{
	public static void main(String[] args) {
		int Arr[]={45,96,52,33,41,799,45,12,32,14,63};

		int high=0;


		for(int i=0;i<Arr.length;i++){

			if(Arr[i] > high){
				high=Arr[i];
			}
		}

		System.out.println("Highest element is :"+high);
	}
}