package com.griffith.BookClub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.griffith.BookClub.models.LoginUser;
import com.griffith.BookClub.models.User;
import com.griffith.BookClub.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
    public User register(User newUser, BindingResult result) {
		Optional<User> potentialUser = this.userRepo.findByEmail(newUser.getEmail());
		if(potentialUser.isPresent()) {
			result.rejectValue("email", "EmailTaken", "This Email is taken! Try again.");
		}
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "NoMatchy", "Password must match Confirm Password!");
		}
		if(result.hasErrors()) {  
			return null;
		}
		else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashed);
			return this.userRepo.save(newUser);
		}
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
		Optional<User> potentialUser = this.userRepo.findByEmail(newLoginObject.getEmail());
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "NotFound", "This email does not exist. Who you?");
		}
		else {
			if(!BCrypt.checkpw(newLoginObject.getPassword(), potentialUser.get().getPassword())) {
			result.rejectValue("password", "No Matchy", "Invalid Password!");
			}
		}
		if(result.hasErrors()) {
			return null;
		}
		else {
			return potentialUser.get();
		}
    }
		public User findOneUser(Long id) {
		return this.userRepo.findById(id).orElse(null);
    }
}