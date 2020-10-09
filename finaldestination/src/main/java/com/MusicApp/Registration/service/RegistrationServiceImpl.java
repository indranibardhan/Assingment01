package com.MusicApp.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MusicApp.Registration.dao.Registrationdao;
import com.MusicApp.Registration.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	Registrationdao registrationDao;

	@Override
	public User saveUser(User user) {
		
		return registrationDao.save(user);
	}

	@Override
	public User fetchUserByEmailId(String email) {
		return registrationDao.findByEmailId(email);
		
	}

	
	  @Override public User fetchUserByEmailIdAndPassword(String email, String password) {
	  
	  return registrationDao.findByEmailIdAndPassword(email, password);
			  
	  }

	@Override
	public User getAllUser() {
		// TODO Auto-generated method stub
		return (User) registrationDao.findAll();
	}

	@Override
	public User updateUser(User e) {
		// TODO Auto-generated method stub
		return registrationDao.save(e);
	}

	@Override
	public void deleteUser(String emailId) {
		// TODO Auto-generated method stub
		registrationDao.findByEmailId(emailId);
	}
	 

}
