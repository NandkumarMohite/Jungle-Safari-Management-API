package com.junglesafari.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Robot")
public class Robota {
@Id
private int srNo;
private String firstName;
private String lastName;
private String emailId;
private String mobileNumber;
private int packageId;
private String packageName;
private int numberOfPeople;
public Robota() {
	super();
}
public Robota(int srNo, String firstName, String lastName, String emailId, String mobileNumber, int packageId,
		String packageName, int numberOfPeople, int howManyPeoples, String dateOfCome, String timeSlot) {
	super();
	this.srNo = srNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.mobileNumber = mobileNumber;
	this.packageId = packageId;
	this.packageName = packageName;
	this.numberOfPeople = numberOfPeople;
	this.howManyPeoples = howManyPeoples;
	this.dateOfCome = dateOfCome;
	this.timeSlot = timeSlot;
}
public int getSrNo() {
	return srNo;
}
public void setSrNo(int srNo) {
	this.srNo = srNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public int getPackageId() {
	return packageId;
}
public void setPackageId(int packageId) {
	this.packageId = packageId;
}
public String getPackageName() {
	return packageName;
}
public void setPackageName(String packageName) {
	this.packageName = packageName;
}
public int getNumberOfPeople() {
	return numberOfPeople;
}
public void setNumberOfPeople(int numberOfPeople) {
	this.numberOfPeople = numberOfPeople;
}
public int getHowManyPeoples() {
	return howManyPeoples;
}
public void setHowManyPeoples(int howManyPeoples) {
	this.howManyPeoples = howManyPeoples;
}
public String getDateOfCome() {
	return dateOfCome;
}
public void setDateOfCome(String dateOfCome) {
	this.dateOfCome = dateOfCome;
}
public String getTimeSlot() {
	return timeSlot;
}
public void setTimeSlot(String timeSlot) {
	this.timeSlot = timeSlot;
}
private int howManyPeoples;
private String dateOfCome;
private String timeSlot;
}
