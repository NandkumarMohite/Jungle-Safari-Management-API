package com.junglesafari.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "select_plan")
public class SelectPlan {
	
	@Id
    int srNo;
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	private int howManyPeoples;
	private String dateOfCome;
	private String timeSlot;
	
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
	public SelectPlan(int srNo, int howManyPeoples, String dateOfCome, String timeSlot) {
		super();
		this.srNo = srNo;
		this.howManyPeoples = howManyPeoples;
		this.dateOfCome = dateOfCome;
		this.timeSlot = timeSlot;
	}
	public SelectPlan() {
		super();
	}
	
	

}
