package com.MusicApp.Registration.service;

import com.MusicApp.Registration.model.User;

public interface RegistrationService {

	User saveUser(User user);
	
	User fetchUserByEmailId(String email);
	
	User fetchUserByEmailIdAndPassword(String email, String password);
	
	User getAllUser();

	public User updateUser(User e);

	public void deleteUser(String emailId);
}
