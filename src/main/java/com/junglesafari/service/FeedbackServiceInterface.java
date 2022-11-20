package com.junglesafari.service;

import java.util.List;

import com.junglesafari.model.Feedback;

public interface FeedbackServiceInterface {

	List<Feedback> findAll();
	
	Feedback addFeedback(Feedback f);

}
