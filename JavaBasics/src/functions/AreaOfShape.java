package functions;

public class AreaOfShape {

	private int areaOfTriangle(int b,int h)
	{
		int Res1=(b*h)/2;  // Formula of area of triangle
		System.out.println("Area of Triangle:-- " +Res1);
		return(Res1);
	}
	
	void areaOfCircle(int r,double pi)
	{
		double Res2=pi*r*r;
		System.out.println("Area of Circle:-- " +Res2);
		//return(Res2);
	}
	
	public void areaOfSquare(int s)
	{
		double Res3=s*s;
		System.out.println("Area of Square:-- " +Res3);
		//return(Res3);	  //return type is void thats why not return value declare here
	}
	
	public static double areaOfRectangle(int w,int l)
	{
		double Res4=w*l;
		System.out.println("Area of Rectangle:-- " +Res4);
		return(Res4);	
	}
	public static void main(String[] args)
	{
		
		int b=10, h=17, w=14, l=17;  // variable declared locally
		int s=21, r=18;
		double pi=3.14;
		
		AreaOfShape area1= new AreaOfShape();
		AreaOfShape area2= new AreaOfShape();
		AreaOfShape area3= new AreaOfShape();
		
		area1.areaOfTriangle(b,h); 
		area2.areaOfCircle(r,pi); //calling variable which are declared above
		area3.areaOfSquare(s);
		AreaOfShape.areaOfRectangle(w,l);
		
		// direct pass argument value while calling method 
		
		/*area1.areaOfTriangle(10,21); 
		area2.areaOfCircle(13,3.14);
		
		area3.areaOfSquare(8);
		
		AreaOfShape.areaOfRectangle(3,7); */

	}

}
