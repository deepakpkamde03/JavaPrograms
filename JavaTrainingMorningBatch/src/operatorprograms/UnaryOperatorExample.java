package operatorprograms;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		/*
		 * This is Local Variable
		 */
		int a=10;
		int b=99;
		
		/*This is Post Increment
		 * In,Post Increment, currnet 
		 * value will get print first, then it will get increment
		 */
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(a++);//11
		System.out.println(a);//12
		/*
		 * In Pre Increment,Value will get Increment 
		 * First then,will gets printed.
		 * 
		 */
		System.out.println(++b);// 100
		
		
		System.out.println(a++ + ++b);
		// 12 + 101= 113
		// 12 + 99 = 111 

	}

}
