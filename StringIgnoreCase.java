package org.system;

public class StringIgnoreCase {

	public static void main(String[] args) {

		String str1 = "I am Learning Java";
		String str2 = "I am learning java";

		if (str1.equals(str2))
			System.out.println("Both are same using Euqals method");

		else

			System.out.println("Both Are Different - Equals method ");

		if (str1.equalsIgnoreCase(str2))
			System.out.println("Both are Same using EqualsIGnoreCase");
		else
			System.out.println("Both Are Different -EqualsIgnoreCase");
		
		if (str1==str2)
			System.out.println("Both are same - == operator");
		else
			System.out.println("Both are Different- == operator");
	}
}
