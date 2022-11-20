package com.junglesafari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.model.SelectPlan;

import com.junglesafari.service.SelectPlanServiceInterface;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class SelectPlanController {
	
	@Autowired
	private SelectPlanServiceInterface selectPlanServiceInterface;
	
	@PostMapping("/selectTimeSlot")
	public boolean selectPlan(@RequestBody SelectPlan r) {
		
		return selectPlanServiceInterface.addPlan(r); 
		
	}
	
	@GetMapping("/selectPlan2/{srNo}")
	public SelectPlan getSelectDetails(@PathVariable int srNo) {
		
				return selectPlanServiceInterface.getSelectDetails(srNo);
		
	}

}
