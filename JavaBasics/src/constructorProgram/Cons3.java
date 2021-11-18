package constructorProgram;

public class Cons3
{

	int roll ;
	double salary ;
	
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons3 c1 = new Cons3();		// when we create object java compile automatically create default constructor
		c1.display();		
	}
}
