package com.bell.grp;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	Random random = new Random();
	@GetMapping("/home")
    public Hello home ()  throws InterruptedException{
    	Thread.sleep(1000+random.nextInt(1000));
    	return new Hello();
    }
    @PostMapping(path="/user", consumes = "application/json", produces = "application/json")
    public User user(String login,String password,@RequestBody User user) throws InterruptedException {
    	Thread.sleep(1000+random.nextInt(1000));
				return new User(String.format(user.getLogin()),String.format(user.getPassword()));
    }
  
    

}
