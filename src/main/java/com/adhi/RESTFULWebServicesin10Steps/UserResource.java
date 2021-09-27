package com.adhi.RESTFULWebServicesin10Steps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

@Autowired
private UserDao users;

@GetMapping(path="/users")
private List<User> findall()
{
 return	users.findAll();
	
}

@GetMapping(path="/users/{id}")
private User getUser(@PathVariable int id)
{
	return users.findUser(id);
}

@PostMapping(path="/users")
private void saveUsers(@RequestBody User user)
{
	users.saveUser(user);
}
} 

