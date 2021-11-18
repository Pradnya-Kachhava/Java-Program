package functions;

/**
 * Question 2 – return type is different. Method name & argument list same.
 * Ans - No & It will give compile time error
 * 
 */

public class MethodOverloading7 {
	//syntax of method - (access modifier-public) (return Type-int) (Method Name - myMethod) (Arguments - int num1.num2)
	
	
	/*   public int myMethod(int var1, int var2)    // Error given because return type is different in both method overloading which 
	   												//gives compile time error
	   {
	      System.out.println("Second myMethod of class Demo");
	      return var1-var2;
	   }
	   
	   public double myMethod(int num1, int num2)
	   {
	      System.out.println("First myMethod of class Demo");
	      return num1+num2;
	   }*/
	   
	   //Proper or correct program is 
	   
	   public double myMethod(double var1, int var2)
	   
	   {
		   	System.out.println("Second myMethod of class Demo");
		   	return var1-var2;
	   }

	   public double myMethod(int num1, int num2)
	   {
		   System.out.println("First myMethod of class Demo");
		   return num1+num2;
	   }
	   public static void main(String args[])
	   {
	      MethodOverloading7 obj2= new MethodOverloading7();
	      obj2.myMethod(10.9,10);  // called method first as its return type is double - double can store any data type (value) 
	      obj2.myMethod(20,12);  // called method first as its return type is double - double can store any data type (value)
	   }

}
