package com.junglesafari.service;

import java.util.List;

import com.junglesafari.model.AddToCart;
import com.junglesafari.model.Feedback;

public interface AddToCartInteface {

	AddToCart addCart(AddToCart f);

	AddToCart findAll(int SrNo);

	List<AddToCart> findAll();

}
