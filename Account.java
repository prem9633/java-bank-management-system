package bankaccountapp;
import java.sql.*; 

// The parent class for both the Savings & Checking accounts
// This class is defined as abstract as we'll not create objects of this class
// Also, it implements the interface IBaseRate to access the base rate
public abstract class Account implements IBaseRate {
	
	private static int index = 10000;

	// List common properties for both savings and checking accounts
	private String name;
	private String ssn;
	private double balance;

	protected String accNum;
	protected double rate;

	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.index++;
		this.name = name;
		this.ssn = ssn;
		this.balance = initDeposit;
		
		
		
		// Set the base rate
		this.setRate();
	}



	// An abstract method to set the base rate depending upon the account type
	public abstract void setRate();

	// List common methods
	
	
	public void showInfo() {
 Conn c1 = new Conn();
   String q1 ="insert into accountdetails values('"+this.name+"','"+this.accNum+"','"+this.balance+"','"+this.rate+"')";
  c1.s.executeUpdate(q1);
		System.out.println("NAME: " + this.name + "\nACCOUNT NUMBER: " + this.accNum + "\nBALANCE: " + this.balance
				+ "\nRATE: " + this.rate + "%");
	}
}
