package org.system;

public class StringReplace {

	public static void main(String[] args)
	{
		String sentence="I am working with java8";
		
		String replace=sentence.replace("8" ,"11");
		System.out.println(replace);
		
		 String substr =sentence.substring(4, 13);	 
		 System.out.println(substr);
	}
	
}
