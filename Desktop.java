package org.system;


// Assignment1
//Single level inheritance
//key word is extends

public class Desktop extends Computer {

	public void desktopSize(int a, int b) {

		System.out.println("my desktop size is :" + a + "x" + b);
	}

	public static void main(String[] args) {

		Desktop objDesk = new Desktop();
		objDesk.computerModel("LAPTOP-FETCCJC8");
		objDesk.desktopSize(1400, 1209);
	}
}
