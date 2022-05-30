package org.sam;

public class StringClass {

	public static void main(String[] args) {

		StringBuffer b= new StringBuffer ("apple");
		StringBuffer b1 = new StringBuffer ("c");
		System.out.println(System.identityHashCode(b));
		b = b.append(b1);
		System.out.println(System.identityHashCode(b));	

		

	}
}
