package day20_This_final;

public class FinalKeyword3 {

	int cube(final int n){   //final int n=5;
		System.out.println(n);  //5
		   int res=n+2;   //can't be changed as n is final  
		   return n*n*n;  
		   
		  }

	public static void main(String args[]) {
		FinalKeyword3 b = new FinalKeyword3();
		//b.cube(5);
		System.out.println("Cube of Number : " +b.cube(5));
	}
}
