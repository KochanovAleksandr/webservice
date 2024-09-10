package com.bell.grp;


import com.fasterxml.jackson.annotation.JsonProperty;

class User {
	@JsonProperty("login")
	private final String login;
	@JsonProperty("password")
	private final String password;
		 public User(String login, String password) {
		        this.login = login;
		        this.password = password;
		    }
		 
		 public String getLogin() {
		        return login;
		 	}
		 public String getPassword() {
		        return password;
		 	}
		 public String getDate() {
			 java.time.LocalDate date = java.time.LocalDate.now();
	    	return date.toString();
		 	}

		

		    
		    
}
		    	
		    
		   

