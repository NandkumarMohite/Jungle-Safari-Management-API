package com.junglesafari.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.model.Plan;
import com.junglesafari.service.PlanServiceInterface;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class PlanController {

	@Autowired
	private PlanServiceInterface planServiceInterface;

	//displaying existing packages - admin
	@GetMapping("/Displayplan")
	public List<Plan> getAllPlan(){
		return planServiceInterface.findAll();
	}
	
	
	//adding new package - admin
	@PostMapping("/addplan")
	public boolean addPlan(@RequestBody Plan p) {
		
		
		return planServiceInterface.addPlan(p); 
		
	}
	
	
	//updating the existing package - admin
	@PutMapping("/update/{planId}")
	
    public Plan updatePlan(@RequestBody Plan pl,@PathVariable("planId") int planId)
    {
		return planServiceInterface.updatePlan(pl,planId);
       
    }
	
	//whenever user click on book now then the then that plan will be selected and goes to form where we can put date of come and number of peoples
	@GetMapping("/getplan/{id}")
	public Plan getPlanDetails(@PathVariable int id) {
		
				return planServiceInterface.getPlanDetails(id);
		
	}
	
	//deleting the existing package - admin
	@DeleteMapping("/deleteplan/{planId}")
    public String deletePlanById(@PathVariable("planId") int planId)
    {
        planServiceInterface.deletePlanById(planId);
  
        return "Deleted Successfully";
    }
}
