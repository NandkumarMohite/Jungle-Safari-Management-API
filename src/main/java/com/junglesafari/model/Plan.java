package com.junglesafari.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Plan")
public class Plan {
	@Id
    int packageId;
	private String packageName;
	private String description;
	private double packagefeeFore;
	private double packagefeeIndian;
	private int numberOfPeople;
	public Plan(int packageId, String packageName, String description, double packagefeeFore, double packagefeeIndian,
			int numberOfPeople) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.description = description;
		this.packagefeeFore = packagefeeFore;
		this.packagefeeIndian = packagefeeIndian;
		this.numberOfPeople = numberOfPeople;
	}
	public Plan() {
		super();
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