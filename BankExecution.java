package org.system;


//  Assignment 3

public class BankExecution {

	// for executing Bankinfo and Axisbank class methods

	public static void main(String[] args) {

		AxisBank objBank1=new AxisBank();
		
		objBank1.saving(20000);
		objBank1.fixed(100000);
		objBank1.deposit(50000);
		
		BankInfo objB2=new BankInfo();
		objB2.deposit(30000);
		
	}

}
