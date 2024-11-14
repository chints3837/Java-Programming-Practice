
import java.util.*;


class Program32
{
	public static void main(String[] args) {
		

		int Arr[]={45,12,84,33,41,95,47,23,10,9,2,48};

		sort(Arr);
	}

	public static void sort(int[] Arr)
	{	

		int minindex=0;
		int temp=0;
		for(int i=0;i<Arr.length;i++)
		{
				minindex=i;

			for(int j=i;j<Arr.length;j++)
			{

				if(Arr[minindex]>Arr[j])
				{
					minindex=j;
				}

			}
				temp=Arr[i];
				Arr[i]=Arr[minindex];
				Arr[minindex]=temp;
		}

		for(int k=0;k<Arr.length;k++)
		{
			System.out.print(Arr[k]+"\t");
		}
		System.out.println();
	}
}