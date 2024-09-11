package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonProperty;

class User {
	@JsonProperty("login")
	private final String login;
	@JsonProperty("password")
	private final String password;
	private final String date;
		 public User(String login, String password) {
		        this.login = login;
		        this.password = password;
				this.date = java.time.LocalDate.now().toString();
		        //java.time.LocalDate date = ;
		        //return date;
		    }
		 /*public String getDate() {
			 java.time.LocalDate date = java.time.LocalDate.now();
	    	return date.toString();
		 	}*/
		 public String getLogin() {
		        return login;
		 	}
		 public String getPassword() {
		        return password ;
		 	} 
		 public String getDate() {
		 return date;

		 }

		    
		    
}
