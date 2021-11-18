package functions;

public class TempConversion {

	// method to convert fahrenheit to celsius
	  public static double toCelsius(double fahrenheit){
	     return ((5.0/9.0) * (fahrenheit - 32));
	  }

	  public static void main(String[] args) {

	     // declare variables
	     double celsius = 0.0;
	     double fahrenheit = 0.0;

	     // create Scanner class object
	    // Scanner scan = new Scanner(System.in);

	     // read input
	     System.out.print("Enter Fahrenheit value::");
	     //fahrenheit = scan.nextDouble();

	     // convert temperature
	     celsius = toCelsius(fahrenheit);

	     // display result
	     System.out.format("Celsius value = %.2f",
	                          celsius);

}
}
