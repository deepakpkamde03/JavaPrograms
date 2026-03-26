package operatorprograms;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age to Check Voting Eligiblity : ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Eligible for Voting");
		}
		
		

	}

}
