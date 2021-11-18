package day23_Abstraction;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Overriding4 extends ABC {
	public void myMethod() {
		//Overriding4 is child class of parent class ABC
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}
}