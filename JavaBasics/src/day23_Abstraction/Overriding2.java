package day23_Abstraction;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog2 extends Animal2 {
	/*public void move(int b) {
		System.out.println("int == Animals can move");
	}*/
	public void move() {
		super.move(); // invokes the super class method
		System.out.println("Dogs can walk and run");
	}
}
public class Overriding2 {

	public static void main(String args[]) {
		/*Animal2 a= new Animal2();
		a.move();*/
		
		Animal2 b = new Dog2(); // Animal reference but Dog object
		b.move(); // runs the method in Dog class
	}
}