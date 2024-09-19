package com.example.webServ;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController

public class UserController {
	
	
	@GetMapping(path="/home", produces = "application/json")
	public ResponseEntity<Users> user(){
		Users user = new Users();
		return ResponseEntity.ok(user);
	}
	
	@PostMapping(path="/", consumes = "application/json", produces = "application/json" )
	public ResponseEntity<Users> usr(@Valid @RequestBody Users user){
		String login = user.getLogin();
		String password = user.getPassword();
		Users usr = new Users(login, password);
		return ResponseEntity.ok(usr);
	}
	
	@PostMapping(path="/users")
	 public String addUser(@RequestBody  Map<String, String> users) {
        
		Users usr = new Users();
		
		usr.setLogin(users.get("login"));
		usr.setPassword(users.get("password"));
		return usr.toString();
    }



}
