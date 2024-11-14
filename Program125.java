// second highest number 

import java.util.Scanner;
import java.util.*;


class Program125
{
	public static void main(String[] args) {
		
		int Arr[]={12,56,96,14,33,87,51,66,02,41,36,77};

		int high=Arr[0];
		int sHigh=0;
		for(int i=0;i<Arr.length;i++)
		{
		   	if(sHigh < Arr[i])
		   	{
		   		sHigh=Arr[i];
		   	}

		   	if(high < Arr[i])
		   	{
		   		sHigh = high;
		   		high=Arr[i];

		   	}


		}

		System.out.println("Highest value is :"+high);
		System.out.println("Second heighest is :"+sHigh);
	}
}