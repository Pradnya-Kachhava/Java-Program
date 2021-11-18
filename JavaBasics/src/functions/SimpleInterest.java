package functions;

public class SimpleInterest {

	double principle=20000;
	double rateofinterest=8;
	double time=90;
	public double Interest(double principle, double rateofinterest, double time)
	{
		double interest=(principle*rateofinterest*time)/100;
		
		System.out.println("Value Of Principle:-- " +principle);
		System.out.println("Value Of Rate of Interest:-- " +rateofinterest);
		System.out.println("Value Of time:-- " +time);
		
		System.out.println("Value of Simple Interest is::--" +interest);
				
		return(interest);	
	}
	
	public static void main(String[] args) 
	{
		SimpleInterest SimpInt=new SimpleInterest();
		
		SimpInt.Interest(SimpInt.principle, SimpInt.rateofinterest, SimpInt.time);

	}
}
