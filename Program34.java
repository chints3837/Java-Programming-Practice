//Bubbel Sort



import java.util.*;

class Program34
{
	public static void main(String[] args) {
		int Arr[]={10,45,33,81,13,64,42,97,73};

		bubbelSort(Arr);

	}

	public static void bubbelSort(int[] Arr){

		for(int i=0;i<Arr.length-1;i++){
			
			for(int j=0;j<Arr.length-1;j++){

				if(Arr[j]>Arr[j+1]){

					int temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
				}
			}
		}		 

		for(int k=0;k<Arr.length;k++){
			System.out.println(Arr[k]);
		}
	}
}