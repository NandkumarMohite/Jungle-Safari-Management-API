package com.junglesafari.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddToCart")
public class AddToCart {
	 @Id
int srNo;
	
	private String firstName;
	private String lastName;
	private String emailId;
	
	private String mobileNumber;
	private String dateOfBirth;
	
	private String city;
	
	private String gender;
	
	private String nationality;
	
	
	
	private int howManyPeoples;
	private String dateOfCome;
	private String timeSlot;
	
	  int packageId;
		private String packageName;
		private String description;
		private double packagefeeFore;
		private double packagefeeIndian;
		private int numberOfPeople;
		public AddToCart(int srNo, String firstName, String lastName, String emailId,
				String mobileNumber, String dateOfBirth, String city, String gender, String nationality,
				 int howManyPeoples, String dateOfCome, String timeSlot, int packageId,
				String packageName, String description, double packagefeeFore, double packagefeeIndian,
				int numberOfPeople) {
			super();
			this.srNo = srNo;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			
			this.mobileNumber = mobileNumber;
			this.dateOfBirth = dateOfBirth;
			this.city = city;
			this.gender = gender;
			this.nationality = nationality;
			
			this.howManyPeoples = howManyPeoples;
			this.dateOfCome = dateOfCome;
			this.timeSlot = timeSlot;
			this.packageId = packageId;
			this.packageName = packageName;
			this.description = description;
			this.packagefeeFore = packagefeeFore;
			this.packagefeeIndian = packagefeeIndian;
			this.numberOfPeople = numberOfPeople;
		}
		public AddToCart() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPackagefeeFore() {
			return packagefeeFore;
		}
		public void setPackagefeeFore(double packagefeeFore) {
			this.packagefeeFore = packagefeeFore;
		}
		public double getPackagefeeIndian() {
			return packagefeeIndian;
		}
		public void setPackagefeeIndian(double packagefeeIndian) {
			this.packagefeeIndian = packagefeeIndian;
		}
		public int getNumberOfPeople() {
			return numberOfPeople;
		}
		public void setNumberOfPeople(int numberOfPeople) {
			this.numberOfPeople = numberOfPeople;
		}

}
