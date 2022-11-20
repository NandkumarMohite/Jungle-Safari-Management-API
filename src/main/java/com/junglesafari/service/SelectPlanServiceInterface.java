package com.junglesafari.service;

import com.junglesafari.model.SelectPlan;


public interface SelectPlanServiceInterface {
	

	boolean  addPlan(SelectPlan u);

	SelectPlan getSelectDetails(int srNo);
}
