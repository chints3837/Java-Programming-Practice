import java.util.*;

class Program38
{
	public static void main(String[] args) {
		
		String[] Arr=new String[]{"Prajwal","Sam","Ramesh","Suresh","Soham","Prajwal","Ninad","Sagar","Omkar"};

			String in1="Prajwal";
			String in2="Omkar";
			int icnt=0;
			for(int i=0;i<Arr.length;i++){

				if(Arr[i].equals(in1))
				{
					icnt=0;
				}
				if(! Arr[i].equals(in2)){
					icnt++;
				}
			}
			System.out.println("Value of iCnt ="+icnt);
	}
}