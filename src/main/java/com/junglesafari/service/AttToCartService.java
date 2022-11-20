package com.junglesafari.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.dao.AddToCartDaoInterface;
import com.junglesafari.model.AddToCart;

@Service
public class AttToCartService implements AddToCartInteface {
	
	

	@Autowired
	private AddToCartDaoInterface addToCartInterface;
	
	
	
	
	@Override
	public AddToCart findAll(int SrNo) {
		
		
		

		Optional<AddToCart> x = addToCartInterface.findById(SrNo);
		AddToCart r = new AddToCart();
		if(x.isPresent())
		{
			 r = x.get();
			
		}
		return r;
	}

	@Override
	public AddToCart addCart(AddToCart f) {
		// TODO Auto-generated method stub
		boolean added = false;
		try {
			addToCartInterface.save(f);
			added=true;
		} catch (Exception e) {
			
		}
		return f;
	}

	@Override
	public List<AddToCart> findAll() {
		List<AddToCart> cart =addToCartInterface.findAll();
		return cart;
		
	}

}
