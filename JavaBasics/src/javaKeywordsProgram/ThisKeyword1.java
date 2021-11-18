package javaKeywordsProgram;

class Student {
	int rollno;
	float fee;
	//if we not using this keyword for variable
	/*Student(int rollno1, float fee1) {
		
		rollno1 = rollno;
		fee1 = fee;
	}*/
	
Student(int rollno, float fee) {
		
		this.rollno = rollno;
		this.fee = fee;
	}
	void display() {
		System.out.println("Value of Roll no. :" +rollno + "\nValue of Fee: " +  fee);
	}
}

class ThisKeyword1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, 5000f);
		Student s2 = new Student(112, 6000f);
		s1.display();//0  0.0
		s2.display();//0  0.0
	}
}
