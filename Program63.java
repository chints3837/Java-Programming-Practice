//check Even or Odd

class Program63
{
	public static void main(String[] args) {
	

		int Arr[]={10,50,44,11,78,63,41,31,21,49,86,45};


		for(int i=0;i<Arr.length;i++){
			if(Arr[i] %2 ==0 ){
				System.out.println("Number is Even at index "+i+" and number is :"+Arr[i]);
			}
			else{
				System.out.println("Number is Odd at index "+i+" and number is :"+Arr[i]);

			}
		}

	}
}