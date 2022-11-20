package com.junglesafari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.model.Robota;
import com.junglesafari.service.RobotServiceInterface;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class RobotController {

	@Autowired
	private RobotServiceInterface robotServiceInterface;
	
	@PostMapping("/addrobot")
	public boolean addPlan(@RequestBody Robota p) {
		
		
		return robotServiceInterface.addRobota(p); 
		
	}
	 
	@GetMapping("/robot/{srNo}")
	public Robota getRobotDetails(@PathVariable int srNo) {
		
				return robotServiceInterface.getRobotDetails(srNo);
		
	}
}
