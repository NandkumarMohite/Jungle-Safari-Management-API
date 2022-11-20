package com.junglesafari.service;

import java.util.List;

import com.junglesafari.model.Plan;



public interface PlanServiceInterface {
	
	
	public Plan getPlanDetails(int planId);
	public boolean addPlan(Plan p);
	
	public Plan updatePlan(Plan p, int planId);
	public String deletePlanById(int planId);

	public List<Plan> findAll();
	
	
	
}
