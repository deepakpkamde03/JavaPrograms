package javapackage;

public class UserDefinedExample {

	void demo()
	{
		System.out.println("Hello,This is demo method!!!");
		System.out.println(10+20);
	}
	
	public static void main(String[] args) {

		UserDefinedExample obj = new UserDefinedExample();
		obj.demo();
		obj.test();
		

	}
	
	// Userdefined method
		public void test() {
			System.out.println("Hello, This is Test Method");
			System.out.println(100-99);
		}

}
