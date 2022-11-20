package com.junglesafari.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.dao.RobotDaoInterface;
import com.junglesafari.model.Robota;

@Service
public class RobotService implements RobotServiceInterface {
	@Autowired
	private RobotDaoInterface robotDaoInterface;

	@Override
	public boolean addRobota(Robota p) {
		boolean added = false;
		try {
			robotDaoInterface.save(p);
			added=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return added;
	}

	@Override
	public Robota getRobotDetails(int srNo) {
		Optional<Robota> x = robotDaoInterface.findById(srNo);
		Robota r = new Robota();
		if(x.isPresent())
		{
			 r = x.get();
			
		}
		return r;
		
	}

	

}
