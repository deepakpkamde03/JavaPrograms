package javapackage;

public class MultipleValueStoreExample {

	public static void main(String[] args) {

		// int Array
		int a[] = { 10, 20, 30, 40, 50 };

		// Char Array
		char ch[] = { 'a', 'e', 'i', 'o', 'u' };

		// String Array
		String name[] = { "Simon", "Deepak", "Vinay", "Naina", "Ankush", "Anil" };

		float[] ft = new float[5];
		ft[0] = 1.1f;
		ft[1] = 2.1f;
		ft[2] = 99.99f;
		ft[3] = 77.7f;
		ft[4] = 33.33f;
		// ft[6]=77.4f;

		System.out.println(ft[0]);

		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[4]);

		System.out.println(ch[0]);// a
		System.out.println(ch[4]);// u

		System.out.println(name[4]);// Anil
		System.out.println(name[3]);// Naina

		// It will Give "ArrayIndexOutOfBoundsException" as 10 index is not present in
		// name array.
		System.out.println(name[10]);

	}

}
