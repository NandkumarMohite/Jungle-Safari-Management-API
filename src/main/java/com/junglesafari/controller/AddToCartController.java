package com.junglesafari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.junglesafari.dao.AddToCartDaoInterface;
import com.junglesafari.dao.FeedbackDaoInterface;
import com.junglesafari.model.AddToCart;
import com.junglesafari.model.Feedback;
import com.junglesafari.model.User;
import com.junglesafari.service.AddToCartInteface;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class AddToCartController {
	@Autowired
	private AddToCartInteface addToCartInterface;
	
	
	
	//to display user that which booking is done by the respective user
	@GetMapping("/cartk/{srNo}")
	public AddToCart displayAllCart(@PathVariable int srNo) {
		
				return addToCartInterface.findAll(srNo);
		
	}

	//when user select any package and timeslot this will add that package with timeslot in cart 
	@PostMapping("/addtocart")
	public AddToCart addCart(@RequestBody AddToCart f) {
		return addToCartInterface.addCart(f);
		
		
		
	}
	
	//for admin to see all the bookings which have been done yet
	@GetMapping("/diplayBookings")
	public List<AddToCart> displayAllBookings()
	{
		return addToCartInterface.findAll();
	}
	

}
