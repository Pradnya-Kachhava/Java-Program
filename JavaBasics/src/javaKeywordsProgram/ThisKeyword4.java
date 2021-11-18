package javaKeywordsProgram;

public class ThisKeyword4
{
	void m() {
		System.out.println(this);// prints same reference ID
	}
	
	public static void main(String args[]) {
		ThisKeyword4 obj = new ThisKeyword4();
		
		System.out.println(obj);// prints the reference ID
		System.out.println("-------------------------------------------");
		obj.m();
	}

}

/*
javaKeywordsProgram - name of the package
ThisKeyword4 - name of the class
@ - joins the string
7852e922 - hashcode value of the object*/
