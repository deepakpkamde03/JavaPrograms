package javapackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Entered Number is : "+num1);

		System.out.println("Enter Decimal Number : ");
		float num2=sc.nextFloat();
		System.out.println("Entered Decimal Number is : "+num2);
		
		System.out.println("Enter Name : ");
		String str=sc.next();
		System.out.println("Name is : "+str);
		
		//Boolean Value True,False
		System.out.println("Enter Boolean Value : ");
		boolean bn=sc.nextBoolean();
		System.out.println("Boolean Value is : "+bn);
		
		
		System.out.println("Enter the Character : ");
		char ch=sc.next().charAt(0);
		System.out.println("Character is : "+ch);
		
		
	}

}
