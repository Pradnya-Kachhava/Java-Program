package functions;

public class MethodOverloading6 
{
	static double res;  // When We declare variable globally and also static
	public static double myMethod(int num1, double num2)
	   { 
		res=num1+num2;
	       System.out.println("First myMethod of class Demo::--"+MethodOverloading6.res);
	       return res;
	   }
	   public static double myMethod(int var1, int var2) //
	   {
		   res=var1-var2;
	      // System.out.println("Second myMethod of class Demo"+res);
	       return res;
	   }

	   public static void main(String args[])
	   {
	      // MethodOverloading6 obj1= new MethodOverloading6();  // both method are static so no need to create object method call
	       System.out.println("Second myMethod of class Demo::--" +MethodOverloading6.myMethod(15,12));
	      //MethodOverloading6 obj2= new MethodOverloading6();
	      // obj2.myMethod(20,12.0);
	       MethodOverloading6.myMethod(15,12.0);
	       
	     
	     //obj1.myMethod(10,10.0);
	   }

}
