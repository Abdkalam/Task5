package org.sam;

public class StringClass {

	public static void main(String[] args) {

		String a = "apple";
		String a1 = "system";
		System.out.println(System.identityHashCode(a));
		a = a.concat(a1);
		System.out.println(System.identityHashCode(a));

		StringBuffer b = new StringBuffer("apple");
		StringBuffer b1 = new StringBuffer("c");
		System.out.println(System.identityHashCode(b));

	}
}
