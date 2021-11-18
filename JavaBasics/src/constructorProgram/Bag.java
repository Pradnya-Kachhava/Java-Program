package constructorProgram;

class A2{
	
	A2()
	{
		this(10.56);
		System.out.println("The zero parameterized constructor");
	}
	
	A2(int x)
	{
		System.out.println("the int Constructor value : " +x);
	}
	
	A2(double d)
	{
		this(78);
		System.out.println("the double Constructor value : " +d);
	}
}


class Bag {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		/*A2 m1 = new A2();
		A2 m2 = new A2(45.88);
		A2 m3 = new A2(7889);*/
		
		A2 m1 = new A2();

	}

}
