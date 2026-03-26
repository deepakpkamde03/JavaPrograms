package javapackage;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		
		System.out.println("Enter Value to find Sqaure : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int square=num*num;
		float num3;
		System.out.println("Square of a entered number is : "+square);// Here, + is using for concat

	}

}
