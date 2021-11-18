package day20_This_final;

class Student101 {
	int rollno;
	float fee;
	
	Student101(int rollno)  // user defined parameterised constructor with int value
	{
		this.rollno = rollno;
	}
	
	Student101(int rollno, float fee) // user defined parameterised constructor with int,float value
	{
		this(rollno);// reusing constructor
		this.fee = fee;  // call global variable
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement3 {
	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		Student101 s1 = new Student101(111);// rollno--->111  no value initialize for fee --->0.0  so print default value
		//System.out.println(s1.rollno +" "+s1.fee);
		System.out.println(s1.rollno);  // rollno------>111
		
		
		System.out.println("**********************Creating S2 object***************************");
		Student101 s2 = new Student101(112, 6000f);// rollno--->112 fee--->6000.0
		System.out.println(s2.rollno +" "+s2.fee +"\n");
		
		
		System.out.println("*****************Display()*************************");
		s1.display();//111 0.0
		s2.display();//112 6000
	}
}
/**
* One constructor calls another constructor of the class called Constructor Chaining
*/