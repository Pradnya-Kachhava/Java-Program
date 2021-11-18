package functions;

public class Memory {
	
    static int salary; //static &globally
	int empId;	// non static - global
	
	void display()
	{

		System.out.println("I am display()...");
	}
	
	static void print() //static
	{
		
		System.out.println("I am print()...");
	}
	
	public static void main(String[] args) { //static
		//access static members---> static variable and method
		System.out.println("static variable salary: "+Memory.salary);//0  -- np need object
		Memory.print();		
		
		//access non static members---> non-static variable and method
		Memory m1=new Memory();
		System.out.println("non-static variable empId: "+m1.empId);//0
		m1.display();		
		
		//update static member
		Memory.salary=25000;
		System.out.println("update static variable salary: "+Memory.salary);//25000
		//update non-static member
     		m1.empId=205;
		System.out.println("update non-static variable empId: "+m1.empId);//205		
	    Memory m2=new Memory();
		System.out.println("2nd instance non-static variable empId: "+m2.empId);//0
		m2.display();
		
		//update static member
				Memory.salary=45000;
				System.out.println("update static variable salary: "+Memory.salary);//25000
				//update non-static member
				m2.empId=333;
				System.out.println("update non-static variable empId: "+m2.empId);//205		
				Memory m3=new Memory();
				System.out.println("2nd instance non-static variable empId: "+m3.empId);//0
				m2.display();
	}

}
