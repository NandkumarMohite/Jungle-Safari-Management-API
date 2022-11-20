package com.junglesafari.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.dao.SelectPlanDaoInterface;
import com.junglesafari.model.SelectPlan;

@Service
public class SelectPlanService implements SelectPlanServiceInterface{

	@Autowired
	private SelectPlanDaoInterface selectPlanDaoInterface;
	

	@Override
	public boolean addPlan(SelectPlan u) {
		boolean added = false;
		try {
			selectPlanDaoInterface.save(u);
			added=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return added;}

	@Override
	public SelectPlan getSelectDetails(int srNo) {
		Optional<SelectPlan> x = selectPlanDaoInterface.findById(srNo);
		SelectPlan r = new SelectPlan();
		if(x.isPresent())
		{
			 r = x.get();
			
		}
		return r;
	}
}
