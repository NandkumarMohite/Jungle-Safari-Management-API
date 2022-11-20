package com.junglesafari.service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junglesafari.dao.UserDaoInterface;
import com.junglesafari.model.User;


@Service
public class UserService implements UserServiceInterface {	
	@Autowired
	private UserDaoInterface userDaoInterface;
	

	@Override
	public User getUserDetails(int srNo) {
		// TODO Auto-generated method stub

		
		Optional<User> x = userDaoInterface.findById(srNo);
		User r = new User();
		if(x.isPresent())
		{
			 r = x.get();
			
		}
		return r;
	}

	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		boolean added = false;
		try {
			userDaoInterface.save(u);
			added=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return added;
	}

	
	// Update operation
    @Override
    public User updateUser(User u,int srNo){
    	User depDB = userDaoInterface.findById(srNo).get();        
    		if((Objects.nonNull(u.getFirstName()) && !"".equalsIgnoreCase(u.getFirstName()))&&(Objects.nonNull(u.getLastName()) && !"".equalsIgnoreCase(u.getLastName()))&&(Objects.nonNull(u.getEmailId()) && !"".equalsIgnoreCase(u.getEmailId()))&&(Objects.nonNull(u.getPassword()) && !"".equalsIgnoreCase(u.getPassword()))&&(Objects.nonNull(u.getMobileNumber()) && !"".equalsIgnoreCase(u.getMobileNumber()))&&(Objects.nonNull(u.getDateOfBirth()) && !"".equalsIgnoreCase(u.getDateOfBirth()))&&(Objects.nonNull(u.getUserType()) && !"".equalsIgnoreCase(u.getUserType()))){
								  depDB.setFirstName(u.getFirstName());
								  depDB.setLastName(u.getLastName());
								  depDB.setEmailId(u.getEmailId());
								  depDB.setPassword(u.getPassword());
								  depDB.setMobileNumber(u.getMobileNumber());
								  depDB.setDateOfBirth(u.getDateOfBirth());
								  depDB.setUserType(u.getUserType());
								  }
    		return userDaoInterface.save(depDB);
    }
    
	public  String deleteById(int srNo) {
		User depDB = userDaoInterface.findById(srNo).get(); 
		userDaoInterface.deleteById(srNo);
		if(depDB==null) {
			return "Deleted the User";
			
		}
		return "Action Can't Be Executed";
		
	}
    
    public List<User> findAll()
    {
    	List<User> depBd =userDaoInterface.findAll();
		return depBd;
    	
    	
    }

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDaoInterface.findByEmailIdAndPassword(user.getEmailId(), user.getPassword());
	}


}
   