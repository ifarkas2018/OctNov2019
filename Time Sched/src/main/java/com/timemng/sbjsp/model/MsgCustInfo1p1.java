//project : Time Schedule, author : Ingrid Farkas, 2019 
package com.timemng.sbjsp.model;

// MsgCustInfo1p1 - model class ( the class representing the data of the record in the message table )
public class MsgCustInfo1p1 {
	// @@@@@@@@@@@@ what about first name, last name, email
	private String personID; 
	private String message; // the message
	
	// constructor of the class 
	public MsgCustInfo1p1(String message, String personID) {
		super();
		this.personID = personID;
		this.message = message;
	}

}
