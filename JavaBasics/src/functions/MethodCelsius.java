package functions;

public class MethodCelsius
{
	
	float fahrenheit=92.3f; //*if variable declare globally need reference variable (We Have to create object in main method) 
                            	//to access value
	
	public void fToCelsius(float fahrenheit)
	{
		double celsius=(fahrenheit-32)*5/9;
		System.out.println("Temeperure in Celscius is::  " +celsius);
		return; 
	}
	
	public static void main(String[] args)
		{
		/*float fahrenheit=92.3f;      ******if variable declare locally do not need reference variable(object creation)
		
		MethodCelsius m1=new MethodCelsius();
		System.out.println("Value of Fahrenheit" +fahrenheit);
		m1.fToCelsius(fahrenheit);
		*/
		//**************Or*********
		
		MethodCelsius m1=new MethodCelsius();
		System.out.println("Value of Fahrenheit::  " +m1.fahrenheit);  //need reference variable to access value of fahrenheit
		m1.fToCelsius(m1.fahrenheit);

		}	
}
