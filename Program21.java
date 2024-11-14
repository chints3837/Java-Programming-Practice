//Iteration using Iterator


import java.util.*;
import java.lang.Math;   


class RandomGenrator
{
	public int iMin;
	public int iMax;
	public RandomGenrator()
	{
		this.iMin=20;
		this.iMax=110;
	}

	public int genrate(Random rand)
	{
		int iNo=rand.nextInt(iMax - iMin + 1) + iMin;
		System.out.println("random number is :"+iNo);
		return iNo;
	}
}

class Program21
{
	public static void main(String[] args) {
		Random random=new Random();
		List<Integer> list=new ArrayList<>();
		int num=0;
		RandomGenrator randomGenrator=new RandomGenrator();
		

		for(int i=0;i<=25;i++)
		{
			num=randomGenrator.genrate(random);
			list.add(num);
		}

		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			int i=it.next();
			System.out.println(i);
		}
	
	}
}