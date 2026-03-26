package javapackage;

public class VariableEaxmple2 {
	
	// Global Variable
	int a=100;
	
	// Static Variable
	static int c=500;

	public static void main(String[] args) {
		
		// Create object of a class
		VariableEaxmple2 obj=new VariableEaxmple2();
		
		// Local Variable
		int b=200;
		//Calling Local Variable 
		System.out.println(b);
		// Calling Global Variable
		System.out.println(obj.a);
		
		// Calling Static Variable
		System.out.println(c);
		
		

	}

}
