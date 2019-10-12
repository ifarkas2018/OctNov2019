//project : Time Schedule, author : Ingrid Farkas, 2019 
package com.timemng.sbjsp.model;

// CustNameInfo1p1 - model class ( the class representing the customer ID from the customer table )
// @@@@@@@@@@@@@@ extends PersonInfo1p1
public class CustNameInfo1p1 {

private String customerID; // the employee's ID
//private String firstName; // the employee's first name
//private String lastName; // the employee's last name  

	/*
	// constructor of the class
	public CustNameInfo1p1( String customerID, String firstName, String lastName ) {
		super( firstName, lastName );
		this.customerID = customerID;
		//this.firstName = firstName;
		//this.lastName = lastName;
	}
	*/

	// constructor of the class
	public CustNameInfo1p1( String customerID ) {
		super();
		this.customerID = customerID;
		//this.firstName = firstName;
		//this.lastName = lastName;
	}
	
	// get the customer ID
	public String getCustomerID() {
		return customerID;
	}

	// set the customer ID
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	
	// get the first name
	//public String getFirstName() {
		//return firstName;
	//}
	
	// set the first name
	//public void setFirstName(String firstName) {
		//this.firstName = firstName;
	//}
	
	// get the last name
	//public String getLastName() {
		//return lastName;
	//}
	
	// set the first name
	//public void setLastName(String lastName) {
		//this.lastName = lastName;
	//}
	
}



