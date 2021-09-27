package com.adhi.RESTFULWebServicesin10Steps;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	private int userCount=3;

	static List  <User> users = new ArrayList<User>();
	
	static
	{
		users.add(new User(1,"Adhi",new Date()));
		users.add(new User(2,"Hari",new Date()));
		users.add(new User(3,"Prasath",new Date()));
	}
	
	public List<User> findAll()
	{
		return users;
	}
	
 public List<User> saveUser(User user)
 {
	 if(user.getId()==0)
	 {
		 user.setId(++userCount);
	 }
	 users.add(user);
	return users;
 }
 
 public User findUser(int id)
 {    
	 
	 for(User user:users)
	 {
		 if(user.getId()==id)
		 {
			 return user;	 
		 }
	 }
	return null;
 }
}
