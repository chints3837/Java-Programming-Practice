//Sort Array

import java.util.*;


class Program75
{
	public static void main(String[] args) {
		int Arr[]={45,10,32,21,99,24,39,5,63};
		System.out.println("Unsorted Array");

		for(int i=0;i<Arr.length;i++){
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();

		int temp=0;
		int lowest=0;

		for(int i=0;i<Arr.length;i++){
			lowest=Arr[i];

			for(int j=i+1;j<Arr.length;j++){

				if(lowest > Arr[j]){
					temp=lowest;
					lowest=Arr[j];
					Arr[j]=temp;
				}
			}
			Arr[i]=lowest;
		}

		for(int i=0;i<Arr.length;i++){
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
		

	}
}