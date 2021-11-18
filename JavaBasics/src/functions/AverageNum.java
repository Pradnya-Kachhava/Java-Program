package functions;

public class AverageNum {

	int a= 31, b=54, c=89;           // variable declare globally
	
	public double average(int a,int b,int c) 
	//public static double average(int a, int b, int c) //---- if we use static access modifier then no need of creating
														// object. we can call method from main directly using class name
														// i.e. Averagenum.average(a,b,c);
	{
		double avg=(a+b+c)/3; // Avg declare in method ie local for this method
		
		System.out.println("Average of 3 number is :- " +avg);
		
		return(avg);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AverageNum A1=new AverageNum();
		
	/*	int a=20, b=11, c=32;
		System.out.println("1st Number for average:- "+a);  //Locally declare so no need of reference variable for accessing value
		System.out.println("2nd Number for average:- "+b); 
		System.out.println("3rd Number For average:- "+c);
		
		AverageNum.average(a,b,c); */
		
		
		System.out.println("1st Number for average:- "+A1.a);  //Globally declare variable so called from reference variable
		System.out.println("2nd Number for average:- "+A1.b);  // i.e. A1.a
		System.out.println("3rd Number For average:- "+A1.c); 
		
		A1.average(A1.a,A1.b,A1.c); 
		

	}

}
