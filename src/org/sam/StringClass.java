package org.sam;

public class StringClass {

	public static void main(String[] args) {

		String a = "apple";
		String a1 = "system";
		System.out.println(System.identityHashCode(a));
		a = a.concat(a1);

		

	}
}
