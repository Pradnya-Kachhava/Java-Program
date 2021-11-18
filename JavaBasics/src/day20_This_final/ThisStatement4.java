package day20_This_final;

class Student102 {
	int rollno;
	float fee;
	
	Student102(int rollno)
	{
		this.rollno = rollno;	
	}
	
	Student102(int rollno, float fee)
	{
		this(rollno);// C.T.Error
		this.fee = fee;		
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement4 {
	public static void main(String args[]) {
		Student102 s1 = new Student102(111);//rollno --->111 fee--->0.0
		Student102 s2 = new Student102(112, 6000f);//rollno--->112 fee--->6000.0
		s1.display();//111 0.0
		s2.display();//112 6000.0
	}
}