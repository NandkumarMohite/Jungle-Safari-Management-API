package com.junglesafari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglesafari.model.AddToCart;

@Repository
public interface AddToCartDaoInterface extends JpaRepository<AddToCart, Integer> {

}
