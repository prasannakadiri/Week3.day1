package org.system;

public class ChkStringsEqual {

	public static void main(String[] args) {
		// Instantiating a string by using ' new' key word

		String str3 = new String("kutty");
		String str4 = new String("kutty");

		if (str3 == str4) {
			System.out.println("Given strings are same");
		} else {
			System.out.println("Not Equal");

		}

		if (str3.equals(str4)) {
			System.out.println("Given strings are same");
		} else
			System.out.println("Not same");

		//Using String Literals and compare
		
		String str1="Test";
		String str2="Test";
		
		if (str1==str2)
		{
			System.out.println("Given strings are Equal , when strings literals");
		}
		
		
		
	}

	/*
	 * == operator gives results true or falsefor primitive data types like int ,
	 * long ,float compares the values of the variables but incase of objects, it
	 * compares object references not the values. Above example str3 and str4 even
	 * though its same , == operator compares the references not the values it
	 * returns false . if we use isEquals() it will return true for above .
	 * if we use String literals and use == operator it will retun true .
	 */
	
	
}
