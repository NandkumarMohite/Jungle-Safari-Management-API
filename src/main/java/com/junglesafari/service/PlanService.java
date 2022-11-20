package com.junglesafari.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.dao.PlanDaoInterface;
import com.junglesafari.model.Plan;




@Service
public  class PlanService implements PlanServiceInterface {
	
	
	@Autowired
	private PlanDaoInterface planDaoInterface;
	

	
	//adding new package - admin
	@Override
	public boolean addPlan(Plan p) {
		// TODO Auto-generated method stub
		boolean added = false;
		try {
			planDaoInterface.save(p);
			added=true;
		} catch (Exception e) {
			
		}
		return added;
	}
	
	
	@Override
	// Update operation
	//updating the existing package - admin
    public Plan updatePlan(Plan p, int planId)
    {
    	Plan depDB = planDaoInterface.findById(planId).get();
  
        return planDaoInterface.save(depDB);
    }

	
	//deleting the existing package - admin
	@Override
	public String deletePlanById(int planId) {
		Plan depDB = planDaoInterface.findById(planId).get();
	
		planDaoInterface.deleteById(planId);
		return "";
	}

	@Override
	public List<Plan> findAll() {
		
		List<Plan> depBd =planDaoInterface.findAll();
		return depBd;
	}


	//whenever user click on book now then the then that plan will be selected and goes to form where we can put date of come and number of peoples
	@Override
	public Plan getPlanDetails(int planId) {
		Optional<Plan> y = planDaoInterface.findById(planId);
		Plan p = new Plan();
		if(y.isPresent())
		{
			 p = y.get();
			
		}
		return p;
	}

	
}
   

