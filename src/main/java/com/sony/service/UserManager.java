package com.sony.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sony.model.User;

@Service
public class UserManager {
	private Map<String, User> users;
	
	public UserManager() {
		users = new HashMap<>();
		User user;
		
		user = new User("Rachel", "Green", "rachelgreen@xmpl.com", "NewYork");
		users.put(user.getId(), user);
		
		user = new User("Ross", "Gellar", "rossgellar@xmpl.com", "Chicago");
		users.put(user.getId(), user);
		
		user = new User("Monica", "Gellar", "monicagellar@xmpl.com", "Italy");
		users.put(user.getId(), user);
				
	}
	public Iterable<User> getAllUsers(){
		return this.users.values();
	}
	public User getUserById(String id) {
		return this.users.get(id);
	}

}
