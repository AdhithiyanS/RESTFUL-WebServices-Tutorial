package com.adhi.RESTFULWebServicesin10Steps;

import java.util.Date;

public class User {
	
	private  int id;
	private  String Name;
	private  Date Date;
	
	public User()
	{}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}


	public User(int id, String name, java.util.Date date) {
		super();
		this.id = id;
		Name = name;
		Date = date;
	}
	
	
	

}
