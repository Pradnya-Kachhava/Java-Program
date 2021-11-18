package day22_Inheritance;

//parent class
class fruit {
	fruit(){
		System.out.println("fruit class cons..");  // this is constructor of fruit class
	}
	public void taste() {							// method of fruit class
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class apple extends fruit {
	apple(){                              // constructor of apple class
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {					// method of apple class
		System.out.println("Apple is round");
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		apple fr = new apple(); // object of child class----> when we create object it call constructor 
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class
	}
}