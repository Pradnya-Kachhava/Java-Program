package functions;

public class Assignment1 {

	

	static void simpleInterest(double p, double rate, int time)
	{
		double SI=p*rate*time/100;
		System.out.println("Simple Interest: " +SI);
		
	}
	
	static void areaOfCircle(double r)
	{
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("Area of Circle: " +area);
		
	}
	
	static void degreeToF(double degreeCelcius)
	{
		double res=degreeCelcius*1.8;
		System.out.println("Degree In farenheit: " +res);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assignment1.simpleInterest(105, 8, 20);
		
		Assignment1.areaOfCircle(15);
		
		Assignment1.degreeToF(80);
	}

}
