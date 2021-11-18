package day29_Polymorphism;

public class CompileTime {
	
	static void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers : " +c);
	
	}
	
	static void sum(int a,int b, int d)
	{
		int c= a + b + d;
		
		System.out.println("Addition of three numbers : " +c);
	}

	public static void main(String[] args)
	{
		CompileTime.sum(34, 65);
		CompileTime.sum(55, 72, 32);
	}

}
